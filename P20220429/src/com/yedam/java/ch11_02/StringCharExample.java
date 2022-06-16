package com.yedam.java.ch11_02;

public class StringCharExample {

	public static void main(String[] args) {
		
		String ssn = "010624-1230123"; //왜 주민번호가 스트링이게? 중간에"-"들어가니까~
		char gender = ssn.charAt(7); //문자를 가져오고싶다 하면 char쓰면댐
		
		switch (gender) {
		case '1':
     	case '3':
     		
     		System.out.println("남자입니다.");
			break;
			
     	case '2':
     	case '4':
     		System.out.println("여자입니다.");
			break;
			
		}
		
		
		
		
		

	}

}
