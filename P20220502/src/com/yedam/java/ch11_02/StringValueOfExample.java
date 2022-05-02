package com.yedam.java.ch11_02;

public class StringValueOfExample {

	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;
		
		
		String intStr = String.valueOf(intValue);
		String doubleString = String.valueOf(doubleValue);
		String booString = String.valueOf(booleanValue);
		
		System.out.println(intStr);
		System.out.println(doubleString);
		System.out.println(booleanValue);
		
		System.out.println(""+intValue);
		System.out.println(""+doubleValue);
		System.out.println(""+booleanValue);
		
		
		
		
		

	}

}
