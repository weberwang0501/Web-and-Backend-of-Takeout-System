package edu.fiu.hmts.web.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.jersey.api.spring.Autowire;

import edu.fiu.hmts.domain.Product;
import edu.fiu.hmts.domain.SecQuestion;
import edu.fiu.hmts.domain.SelProduct;
import edu.fiu.hmts.domain.User;
import edu.fiu.hmts.service.IServiceService;
import edu.fiu.hmts.service.IUserService;

/**
 * The Class MobileInterface.
 */
@Autowire
@Path("/service")
public class MobileInterface {

	@Autowired
	private IServiceService servservice;
	
	@Autowired
	private IUserService userService;
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * Register.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response register(User data) {
		try{
			Map<String, Object> map = new LinkedHashMap<>();
			User user = userService.register(data.getUsername(), data.getPassword()
					, data.getFirstName(), data.getLastName(), data.getPhone()
					, data.getRole(), data.getSecQuestionId(), data.getSecAnswer()
					, 1);
			if (user.getUserId() == -1)
				map.put("result", "failed");
			else{
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", user);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Login.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login(User data) {
		try{
			User user = userService.login(data.getUsername(), data.getPassword(), 1);
			Map<String, Object> map = new LinkedHashMap<>();
			if (user.getUserId() == -1)
				map.put("result", "failed");
			else{
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", user);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Logout.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/logout")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logout(User data) {
		try{
			userService.logout(data.getUserId());
			Map<String, String> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", "1");
			map.put("data", "Logout");
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	/**
	 * Display the menu.
	 *
	 * @return the response
	 */
	@Path("/displaymenu")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response displayMenu() {
		logger.info("Show menu");

		try{
			List<Product> proList = servservice.displayMenu();
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", proList.size());
			map.put("data", proList);
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Query product.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/selectproduct")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response selectProduct(SelProduct selProduct) {
		logger.info("Remove a product in shopping cart");
		Map<String, Object> map = new LinkedHashMap<>();

		try{
			int res = servservice.selectProduct(selProduct);
			if (res < 1)
				map.put("result", "failed");
			else{
				List<SelProduct> selProList = servservice.displayCart(selProduct.getUserId());
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", selProList);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Remove product.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/removeproduct")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response removeProduct(SelProduct selProduct) {
		logger.info("Remove a product in shopping cart");
		Map<String, Object> map = new LinkedHashMap<>();

		try{
			int res = servservice.removeProduct(selProduct.getUserId(), selProduct.getProductId());
			if (res < 1)
				map.put("result", "failed");
			else{
				List<SelProduct> selProList = servservice.displayCart(selProduct.getUserId());
				map.put("result", "successful");
				map.put("count", 1);
				map.put("data", selProList);
			}
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Display the cart.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/displaycart")
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public Response displayCart(long data) {
		logger.info("Show shopping cart");

		try{
			List<SelProduct> selProList = servservice.displayCart(data);
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", selProList.size());
			map.put("data", selProList);
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	/**
	 * Place order.
	 *
	 * @param data
	 *            the data
	 * @return the response
	 */
	@Path("/placeorder")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response placeOrder(JSONObject data) {
		try{
			
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	
	/**
	 * Gets the questions.
	 *
	 * @return the questions
	 */
	@Path("/getquestions")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getQuestions() {
		logger.info("Show questions");

		try{
			List<SecQuestion> quesList = servservice.getQuestions();
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("result", "successful");
			map.put("count", quesList.size());
			map.put("data", quesList);
			return Response.ok(map, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e){
			logger.fatal(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
