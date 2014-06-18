package com.wdxxl.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/*
 * http://www.ziyoula.com/tools/md5.html
 * http://www.cnblogs.com/sunzn/p/3455135.html
 */
public class EncryptAlgorithm {
	private static String MD5 = "md5";
	
	public static String hexMD5(String str) throws Exception{
		return toHex(encryptMD5(str.getBytes()));
	}
	
	private static byte[] encryptMD5(byte[] data) throws NoSuchAlgorithmException{
		MessageDigest md5 = MessageDigest.getInstance(MD5);
		md5.update(data);
		return md5.digest();
	}
	
	//将字节数组转化为16进制的字符串
	private static String toHex(byte[] buffer) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < buffer.length; i++) {
			sb.append(Character.forDigit((buffer[i] & 0xf0) >> 4, 16));//取高半字节右移4位 转化为16进制
			sb.append(Character.forDigit(buffer[i] & 0x0f, 16));//取低半字节 转化为16进制
			/*
			 int temp = buffer[i];
             if (temp < 0)
            	 temp += 256;
             if (temp < 16)
                 sb.append("0");
			 sb.append(Integer.toHexString(0xFF & temp));
			 */
		}
		return sb.toString();
	}
	
	public static void main(String []args) throws Exception{
		System.out.println(hexMD5("12345678"));//32位加密
		System.out.println(hexMD5("12345678").substring(8,24));//16位加密
	}
}
