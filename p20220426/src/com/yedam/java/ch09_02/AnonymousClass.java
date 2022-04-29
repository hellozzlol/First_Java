package com.yedam.java.ch09_02;

public class AnonymousClass {
	
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv를 켭니다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv를 켭니다.");
			
		}
	};
			//로컬변수값으로대입
	
	void method1() {
		RemoteControl locaVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};
		
		locaVar.turnOn();
		locaVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
