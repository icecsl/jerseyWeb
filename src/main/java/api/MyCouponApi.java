package api;

import dao.MyCouponDao;
import model.MyCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by huangbingjing on 17/8/8.
 */
@Component
@Path("/coupon")
public class MyCouponApi {

	@Autowired
	private MyCouponDao myCouponDao;

	@GET
	@Path("/showMyCoupon")
	public String say(@QueryParam("id") Long id){

		MyCoupon myCoupon = myCouponDao.selectById(id);

		return myCoupon.toString();
	}
}
