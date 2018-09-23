package order.web.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import order.model.Order;
import order.service.OrderLocalService;
import order.web.constants.OrderWebPortletKeys;

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
		"javax.portlet.name=" + OrderWebPortletKeys.OrderWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OrderWebPortlet extends MVCPortlet {
	
	public void addOrder(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, ParseException {
		System.out.println("OrderWebPortlet.addOrder()");
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            Order.class.getName(), actionRequest);
		
		long userId = serviceContext.getUserId();
		long orderNumber = ParamUtil.getLong(actionRequest, "orderNumber");
		String orderStatus = ParamUtil.getString(actionRequest, "orderStatus");
		String accountName = ParamUtil.getString(actionRequest, "accountName");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateInString = ParamUtil.getString(actionRequest, "orderStartDate");
		Date orderStartDate = formatter.parse(dateInString);
		String createdBy = ParamUtil.getString(actionRequest, "createdBy");
		String location = ParamUtil.getString(actionRequest, "location");
		System.out.println("OrderWebPortlet.addOrder() orderStartDate = " + orderStartDate);
		System.out.println("OrderWebPortlet.addOrder()= userId = " + userId + " , orderNumber =" + orderNumber + " ,orderStatus=  " + orderStatus + " ,accountName = " + accountName + " ,orderStartDate = " + orderStartDate + " ,createdBy = " + createdBy + " ,location = " + location);
		if(orderNumber > 0) {
			_orderLocalService.updateOrder(userId, orderNumber, orderStatus, accountName, orderStartDate, createdBy, location, serviceContext);
		}else {
			_orderLocalService.addOrder(userId, orderStatus, accountName, orderStartDate, createdBy, location, serviceContext);
		}
	
	}
	
	@Reference(unbind = "-")
    protected void setEntryService(OrderLocalService orderLocalService) {
		_orderLocalService = orderLocalService;
    }
	
	private OrderLocalService _orderLocalService;
}