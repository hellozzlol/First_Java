package com.yedam.java.ch09_02;

public class AnonymousExample {

	public static void main(String[] args) {
		AnonymousClass ac = new AnonymousClass();
		
		//익명 객체 필드로사용
		ac.rc.turnOn();
		System.out.println();
		//익명 객체 로컬변수로 사용
		ac.method1();
		System.out.println();
		//익명 객체 매개 변수로 사용
		ac.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를끕니다");
				
			}
		});

	}

}
