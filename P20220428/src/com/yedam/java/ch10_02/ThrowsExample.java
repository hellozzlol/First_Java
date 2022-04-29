package com.yedam.java.ch10_02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
		
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
//try catch 구문 쓰거나 throws ClassNotFoundException 로 쓰거나 함 그리고 반드시 선언까지해줭햠
	//가능한 메인 쪽으로 던지지 말 것 
}
//ex) Interface List<E> 제너럴 타입은 <>이걸씀 