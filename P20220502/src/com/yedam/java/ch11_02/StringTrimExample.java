package com.yedam.java.ch11_02;

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "    02";
		String tel2 = "123   ";
		String tel3 = "  1234   ";
		
		//중간 공백은 처리못함
		
		System.out.println(tel1+tel2+tel3);
		
		String tel  = tel1.trim()+tel2.trim()+tel3.trim();
		System.out.println(tel);
		
		
		//ㄷ두번째는 공백이 없어진채 나온다 제거시킨 결과를 다시 객체로 만듦.
		
 		
	
	}

}
