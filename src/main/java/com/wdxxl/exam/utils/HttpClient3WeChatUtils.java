package com.wdxxl.exam.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpClient3WeChatUtils {
	private static final String USER_AGENT = "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:26.0) Gecko/20100101 Firefox/26.0";
	private static final String WEIXIN_LOGIN_URL = "https://mp.weixin.qq.com/cgi-bin/login?lang=zh_CN";

	private static Map<String, Object> _post(String url,Map<String, Object> headers, Map<String, Object> date,Map<String, File> files){
		HttpClient httpClient = new HttpClient();
		
		httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
		//设置成了默认的恢复策略，在发生异常时候将自动重试3次，在这里你也可以设置成自定义的恢复策略
		httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler());
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(10000);
		httpClient.getHttpConnectionManager().getParams().setSoTimeout(10000);
		httpClient.getParams().setContentCharset("UTF-8");
		
		PostMethod postMethod = new PostMethod(url);
		postMethod.getParams().setSoTimeout(10000);
		//postMethod.setRequestHeader("Connection", "Keep-Alive");
		postMethod.setRequestHeader("User-Agent", USER_AGENT);
		if (headers != null) {
			for (String key : headers.keySet()) {
				postMethod.setRequestHeader(key, headers.get(key).toString());
			}
		}
		
		int datelen = 0;
		int filelen = 0;
		int index = 0;
		if (date != null) {
			datelen = date.size();
		}
		if (files != null) {
			filelen = files.size();
		}
		Part[] parts = null;
		if (datelen + filelen > 0) {
			parts = new Part[datelen + filelen];
		}
		if (datelen > 0) {
			for (String keyset : date.keySet()) {
				parts[index] = new StringPart(keyset, date.get(keyset)
						.toString(), "UTF-8");
				index++;
			}
		}
		if (filelen > 0) {
			try {
				for (String keyset : files.keySet()) {
					parts[index] = new FilePart(keyset, files.get(keyset));
					index++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		if (parts != null) {
			postMethod.setRequestEntity(new MultipartRequestEntity(parts,
					postMethod.getParams()));
		}
		Map<String, Object> res = null;
		try {
			res = new HashMap<String, Object>();
			String body = null;
			int httpcode = 0;
			String cookie = null;
			httpcode = httpClient.executeMethod(postMethod);
			body = postMethod.getResponseBodyAsString();
			Cookie[] cookies = httpClient.getState().getCookies();
			String tmpcookies = "";
			for (Cookie ck : cookies) {
				tmpcookies += ck.toString() + ";";
			}
			if (tmpcookies != "") {
				cookie = tmpcookies;
			}
			res.put("cookie", cookie);
			res.put("httpcode", httpcode);
			res.put("body", body);
		} catch (HttpException e) {
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}

		return res;
	}
	public static void main(String[]args) throws Exception{
		Map<String, Object> hearder = new HashMap<String, Object>();
		hearder.put("Referer", "https://mp.weixin.qq.com/");
		Map<String, Object> date = new HashMap<String, Object>();
		try {
			date.put("lang", "zh_CN");
			date.put("username", "wdxxldeveloper@gmail.com");
			date.put("pwd", EncryptAlgorithm.hexMD5("B!n71jk1"));
			date.put("imgcode", "");
			date.put("f", "json");
		} catch (Exception e) {
			
		}
		Map<String, Object> response = null;
	
		response = _post("https://mp.weixin.qq.com/cgi-bin/login", hearder,date,null);
		System.out.println(response);
	}
	
	
}
