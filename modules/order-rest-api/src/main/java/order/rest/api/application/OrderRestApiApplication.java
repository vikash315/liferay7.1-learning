package order.rest.api.application;

import com.liferay.portal.kernel.json.JSONFactoryUtil;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;

import order.model.Order;
import order.service.OrderLocalServiceUtil;

/**
 * @author VIKAS
 */
@ApplicationPath("/ordersummary")
@Component(immediate = true, service = Application.class)
public class OrderRestApiApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}
	
	 @GET
	 @Path("/getOrders")
	 @Produces(MediaType.APPLICATION_JSON)
	 public String getOrders(){
		 String jsonString = null;
//		 System.out.println("TestRestApiApplication.getOrders()");
		 List<Order> orderList = OrderLocalServiceUtil.getOrders(-1, -1);
		 jsonString = JSONFactoryUtil.serialize(orderList);
//		 System.out.println("TestRestApiApplication.getOrders() .. jsonString :: " + jsonString + " , Size " + orderList.size());
		 return jsonString;
	 }
	 
	 @GET
	 @Path("/getOrdersByGroupId/{groupId}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public String getOrders(@PathParam("groupId") long groupId){
		 String jsonString = null;
//		 System.out.println("TestRestApiApplication.getOrders()" + groupId);
		 List<Order> orderList = OrderLocalServiceUtil.getOrdersByGroupId(groupId);
		 jsonString = JSONFactoryUtil.serialize(orderList);
//		 System.out.println("TestRestApiApplication.getOrders() .. jsonString :: " + jsonString + " , Size " + orderList.size());
		 return jsonString;
	 }

}