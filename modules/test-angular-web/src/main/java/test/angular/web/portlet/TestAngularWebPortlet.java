package test.angular.web.portlet;

import test.angular.web.constants.TestAngularWebPortletKeys;
import test.angular.web.constants.TestAngularWebWebKeys;

import com.liferay.frontend.js.loader.modules.extender.npm.JSPackage;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author VIKAS
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TestAngularWebPortletKeys.TestAngularWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TestAngularWebPortlet extends MVCPortlet {
	
	/**
	 * https://www.tutorialspoint.com/angular4/angular4_http_service.htm
	 * https://medium.com/codingthesmartway-com-blog/angular-4-3-httpclient-accessing-rest-web-services-with-angular-2305b8fd654b
	 * https://www.encodedna.com/angular/read-an-external-json-file-in-angular-4-and-convert-data-to-table.htm
	 * https://www.concretepage.com/angular-2/angular-4-crud-example
	 * http://jsonplaceholder.typicode.com/users
	 */
	@Override
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		JSPackage jsPackage = _npmResolver.getJSPackage();

		renderRequest.setAttribute(
			TestAngularWebWebKeys.BOOTSTRAP_REQUIRE,
			jsPackage.getResolvedId() + " as bootstrapRequire");

		super.doView(renderRequest, renderResponse);
	}

	@Reference
	private NPMResolver _npmResolver;

}