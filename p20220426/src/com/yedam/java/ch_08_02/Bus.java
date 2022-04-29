package com.yedam.java.ch_08_02;

public class Bus implements Vecicle {
 @Override
	public void run() {
		
		System.out.println("버스가 달립니다.");

	}
	
	public void checkFare() {
		
		System.out.println("승차 요금을 체크합니다.");
		
	}

}
