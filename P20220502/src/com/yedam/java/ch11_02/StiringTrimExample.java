package com.yedam.java.ch11_02;

public class StiringTrimExample {

	public static void main(String[] args) {
		
		String ssn = "880815-123467";
		
		String firstNum = ssn.substring(0,6);//0~5까지 숫자를 잘라내겠다.//첫번째 수는 포함되나 뒤에숫자는 포함 ㄴ
		System.out.println(firstNum);
		
		String secontNum = ssn.substring(7);
		System.out.println(secontNum);
		
		
		

	}

}
