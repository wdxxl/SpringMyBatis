package com.wdxxl.common.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

//http://ak23173969.iteye.com/blog/1954011
//Login
//GetAllGroupAndMember
@SuppressWarnings("deprecation")
public class HttpClient4WeChatUtils {
	//private static final String USER_AGENT = "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:26.0) Gecko/20100101 Firefox/26.0";
	private static final String WEIXIN_LOGIN_URL = "https://mp.weixin.qq.com/cgi-bin/login?lang=zh_CN";

	@SuppressWarnings("resource")
	public static void main(String[]args) throws Exception{
		HttpClient httpclient = new DefaultHttpClient(); 
		String resultCont="";  
        // 请求登录  
        HttpPost httpPost = new HttpPost(WEIXIN_LOGIN_URL);  
        httpPost.addHeader("Referer", "https://mp.weixin.qq.com/");  
  
        List<NameValuePair> nvp = new ArrayList<NameValuePair>();  
        nvp.add(new BasicNameValuePair("f", "json"));  
        nvp.add(new BasicNameValuePair("imgcode", ""));  
        nvp.add(new BasicNameValuePair("pwd", EncryptAlgorithm.hexMD5("B!n71jk1")));  
        nvp.add(new BasicNameValuePair("username", "wdxxldeveloper@gmail.com"));  
        httpPost.setEntity(new UrlEncodedFormEntity(nvp));  
        
        HttpResponse response = httpclient.execute(httpPost);
        
        System.out.println("status:" + response.getStatusLine().getStatusCode()); 
        System.out.println("cookie:" + ((AbstractHttpClient)httpclient).getCookieStore().getCookies().toString());
        resultCont = EntityUtils.toString(response.getEntity());  
        httpPost.releaseConnection();  
        
        System.out.println(resultCont);
	}
	
	
}
