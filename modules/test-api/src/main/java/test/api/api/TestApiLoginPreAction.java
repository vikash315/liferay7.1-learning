/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.api.api;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
		"key=" + PropsKeys.LOGIN_EVENTS_POST
	},
	service = LifecycleAction.class
)
public class TestApiLoginPreAction implements LifecycleAction {
	
	private final static String PUBLIC_PAGE_CONTEXT = "/web";
    private final static String PRIVATE_PAGE_CONTEXT = "/group";
    private final static String PUBLIC_PAGE_CONTEXT_PATH = "/web/guest";

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent)
		throws ActionException {

		System.out.println("login.event.post=" + lifecycleEvent);
		HttpServletRequest request = lifecycleEvent.getRequest();
		String path = PrefsPropsUtil.getString(_portal.getCompanyId(request), PropsKeys.DEFAULT_LANDING_PAGE_PATH);
		System.out.println("TestApiLoginPreAction.processLifecycleEvent() path ==" + path);
		try {
            path = getCustomLandingPage(request);
        } catch (PortalException e) {
            throw new ActionException(e);
        }
		
		if(Validator.isNotNull(path)) {
			System.out.println("TestApiLoginPreAction.processLifecycleEvent() path --- " + path);
            final HttpSession session = request.getSession();
            session.setAttribute(WebKeys.LAST_PATH, new LastPath(StringPool.BLANK, path));
        }
	}

	private String getCustomLandingPage(HttpServletRequest request) throws PortalException {
        String path = null;
        
        //Current User
        User user = _portal.getUser(request);
        System.out.println("TestApiLoginPreAction.getCustomLandingPage()" + user.getEmailAddress());
         
        //Organizations the user belongs to
        List<Organization> orgs = user.getOrganizations();
        if(Validator.isNotNull(orgs) && !orgs.isEmpty()) {
        	System.out.println("TestApiLoginPreAction.getCustomLandingPage() Org Size ::" + orgs.size());
            for(Organization org : orgs) {
                Group orgSite = org.getGroup();
                int publicPageCount = orgSite.getPublicLayoutsPageCount();
                int privatePageCount = orgSite.getPrivateLayoutsPageCount();
                if(publicPageCount > 0) {
                    path = PUBLIC_PAGE_CONTEXT+ orgSite.getFriendlyURL();
                    break;
                } else if(privatePageCount > 0) {
                    path = PRIVATE_PAGE_CONTEXT + orgSite.getFriendlyURL();
                    break;
                }
            }
        }
         
        //Sites the user has access to     
        if(Validator.isNull(path)) {
            List<Group> sites = user.getGroups();
            if(Validator.isNotNull(sites) && !sites.isEmpty()) {
            	System.out.println("TestApiLoginPreAction.getCustomLandingPage() Site Size ::" + sites.size());
                for(Group site : sites) {
                    int publicPageCount = site.getPublicLayoutsPageCount();
                    int privatePageCount = site.getPrivateLayoutsPageCount();
                    if(publicPageCount > 0) {
                        path = PUBLIC_PAGE_CONTEXT + site.getFriendlyURL();
                        break;
                    } else if(privatePageCount > 0) {
                        path = PRIVATE_PAGE_CONTEXT + site.getFriendlyURL();
                        break;
                    }
                }
            }
        }
        
        System.out.println("TestApiLoginPreAction.getCustomLandingPage() path ==" + path);
         
        //Default landing page to the main instance site
        if(Validator.isNull(path) || path.equalsIgnoreCase(PUBLIC_PAGE_CONTEXT_PATH)) {
        	System.out.println("TestApiLoginPreAction.getCustomLandingPage() null and " + PUBLIC_PAGE_CONTEXT_PATH);
            path = PrefsPropsUtil.getString(PortalUtil.getCompanyId(request), PropsKeys.DEFAULT_LANDING_PAGE_PATH);
        }
         
        return path;
	}

	@Reference(unbind = "-")
	protected void setPortal(Portal portal) {
		_portal = portal;
	}
	
	private Portal _portal;
}