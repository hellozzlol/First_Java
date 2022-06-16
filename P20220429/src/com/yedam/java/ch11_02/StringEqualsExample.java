package com.yedam.java.ch11_02;

public class StringEqualsExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		
		//스트링은 좀 특이하다 그성격을 기본성격을 맞춰서 개발자가 사용하기 쉽게만듬
		//각각의 변수로 저장되오있지만 메모리상으론 하나라서 서로 공유함.
		//다른 객체로 만들고 싶다 하면 new클래스로 만들어 주면 됩니다.
		
		String str3 = new String("홍길동");
		
		if(str1 == str2) {
			System.out.println("st1과 str2는같은 객체를 참조합니다.");
			}else {
				System.out.println("st1과 str2는 다른 객체를 참조합니다.");
			}

	
		if(str1 == str3) {
			System.out.println("st1과 str3는같은 객체를 참조합니다.");
			}else {
				System.out.println("st1과 str3는 다른 객체를 참조합니다.");
			}
		
	
	

	
	if(str1.equals(str2)) {
		System.out.println("str1과 str2는 같은 문자열을 가집니다.");
	}else {
		System.out.println("str1과 str2는 다른 문자열을 가집니다");
	}
	if(str1.equals(str3)) {
		System.out.println("str1과 str3는 같은 문자열을 가집니다.");
	}else {
		System.out.println("str1과 str3는 다른 문자열을 가집니다");
	}

}
}
