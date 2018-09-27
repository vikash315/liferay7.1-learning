package test.listener.api;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    service = ModelListener.class
	)
public class JournalArticleModelListener extends BaseModelListener<JournalArticle> {
	@Override
	public void onAfterCreate(JournalArticle model) throws ModelListenerException {
		System.out.println("JournalArticleModelListener.onAfterCreate()");
		super.onAfterCreate(model);
	}
	
	@Override
	public void onBeforeCreate(JournalArticle model) throws ModelListenerException {
		System.out.println("JournalArticleModelListener.onBeforeCreate()");
		super.onBeforeCreate(model);
	}
	
	@Override
	public void onAfterAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		// TODO Auto-generated method stub
		System.out.println("JournalArticleModelListener.onAfterAddAssociation()");
		super.onAfterAddAssociation(classPK, associationClassName, associationClassPK);
	}
	
	@Override
	public void onBeforeAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		// TODO Auto-generated method stub
		System.out.println("JournalArticleModelListener.onBeforeAddAssociation()");
		super.onBeforeAddAssociation(classPK, associationClassName, associationClassPK);
	}
	
	@Override
	public void onAfterUpdate(JournalArticle model) throws ModelListenerException {
		// TODO Auto-generated method stub
		System.out.println("JournalArticleModelListener.onAfterUpdate()");
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("notificationMessage", "webcontent updated");
		try {
			_userNotificationEventLocalService.sendUserNotificationEvents(20139, "807", 0, jsonObject);
			System.out.println("JournalArticleModelListener.onAfterUpdate() sendUserNotificationEvents ");
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.onAfterUpdate(model);
	}
	
	@Override
	public void onBeforeUpdate(JournalArticle model) throws ModelListenerException {
		// TODO Auto-generated method stub
		System.out.println("JournalArticleModelListener.onBeforeUpdate()");
		
		super.onBeforeUpdate(model);
	}
	
	@Reference(unbind = "-")
	protected void setUserNotificationEventLocalService(
		UserNotificationEventLocalService userNotificationEventLocalService) {

		_userNotificationEventLocalService = userNotificationEventLocalService;
	}
	
	private UserNotificationEventLocalService _userNotificationEventLocalService;
	

}
