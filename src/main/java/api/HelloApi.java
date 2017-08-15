package api;

import client.CouponClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by huangbingjing on 17/8/8.
 */
@Component
@Path("/hello")
public class HelloApi {

	@Autowired
	private CouponClient couponClient;

	@GET
	@Path("/say")
	@Produces(MediaType.TEXT_PLAIN)
	public String say(){
		String aaa="a";
		try {
			aaa =couponClient.getUserName("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return aaa;
	}
}
