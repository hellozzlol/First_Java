package com.yedam.java.ch11_02;

public class ByteToStringExample {

	public static void main(String[] args) {
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		
		String string = new String(bytes);
		System.out.println(string);
		
		
		String string2 = new String(bytes,6,4);
		System.out.println(string2);
		
		//주의 할거 

	}

}
