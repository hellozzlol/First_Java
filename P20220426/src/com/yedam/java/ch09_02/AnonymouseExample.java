package com.yedam.java.ch09_02;

public class AnonymouseExample {

	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		
		//익명 객체 필드 사용
	annoy .field.wake();
	System.out.println();
	//익명 객체 로컬 변수 사용
	annoy.method1();

	System.out.println();
	//익명 객체 매개 변수 사용
	annoy.method2(new Person() {
		void study() {
			System.out.println("공부합니다.");
		
	}
	
	@Override
	public void wake() {
		System.out.println("8시에 일어납니다.");
		study();
	}
	
	
	});
	}
}
	
	
