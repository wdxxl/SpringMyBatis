package com.wdxxl.exam.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptAlgorithm {
	private static String MD5 = "md5";
	
	public static String hexMD5(String str) throws Exception{
		return toHex(encryptMD5(str.getBytes()));
	}
	
	private  static byte[] encryptMD5(byte[] data) throws NoSuchAlgorithmException{
		MessageDigest md5 = MessageDigest.getInstance(MD5);
		md5.update(data);
		return md5.digest();
	}
	
	private static String toHex(byte[] buffer) {
		StringBuffer sb = new StringBuffer(buffer.length * 3);
		for (int i = 0; i < buffer.length; i++) {
			sb.append(Character.forDigit((buffer[i] & 0xf0) >> 4, 16));
			sb.append(Character.forDigit(buffer[i] & 0x0f, 16));
		}
		return sb.toString();
	}
	
	public static void main(String []args) throws Exception{
		System.out.println(hexMD5("B!n71jk1"));
	}
}
