package client;


import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huangbingjing on 17/8/15.
 */
@Service
public class CouponClient {
	private final String couponUrl="http://192.168.3.175:8080/acc-app/coupon/queryUCUsedInfo";

	public String getUserName(String userIds) throws IOException {

		//组装参数
		JSONObject params = new JSONObject();
		params.put("userId",98943863);
		params.put("bbId",699319);
		params.put("productType",1);
//		JSONArray params2 = new JSONArray();
//		JSONObject param3 = new JSONObject();
//		param3.put("DOC_TP_CODE", "10100");
//		param3.put("DOC_NBR", "100200198301202210");
//		param3.put("DOC_CUST_NM", "test");
//		params2.add(param3);
//		params.put("DOCS", params2);
		/*String response = doPost(couponUrl, params).toString();
		System.out.println(response);*/

		JSONObject responseI = doPost(couponUrl, params);
		String result = responseI.get("data").toString();

/*
		JSONObject  jasonObject = JSONObject.fromObject(response);
		Map map = (Map)jasonObject;
		System.out.println(map.get("errorCode"));
		List<HashMap> list = (List) map.get("data");
		Map<String,String> resMap = new HashMap<String, String>();
		if (!CollectionUtils.isEmpty(list)){
			for (Map user:list){
				resMap.put(user.get("id").toString(),user.get("realName").toString());
			}
		}*/
		return result;
	}

	public static JSONObject doPost(String url, JSONObject json){
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(url);
		JSONObject response = null;
		post.setHeader("Content-type","application/json; charset=utf-8");
		post.setHeader("Accept", "application/json");
		try {
			StringEntity s = new StringEntity(json.toString(), Charset.forName("UTF-8"));
			post.setEntity(s);
			HttpResponse res = client.execute(post);
			if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
//				HttpEntity entity = res.getEntity();
				String result = EntityUtils.toString(res.getEntity(),"UTF-8");// 返回json格式：
				response = JSONObject.fromObject(result);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return response;
	}
}
