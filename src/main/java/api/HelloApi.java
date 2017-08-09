package api;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by huangbingjing on 17/8/8.
 */
@Component
@Path("/hello")
public class HelloApi {

	@GET
	@Path("/say")
	@Produces(MediaType.TEXT_PLAIN)
	public String say(){
		return "ok";
	}
}
