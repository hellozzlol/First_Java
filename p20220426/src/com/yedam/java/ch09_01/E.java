package com.yedam.java.ch09_01;

public class E {
	
	//필드
	//인스턴스필드
	F f = new F();
	G g = new G(); //인스턴스 필드 정적 필드 같이 사용가능
	//정적 필드 //정적멤버클래스 같이 ㅇㅇ 인스턴스멤버클래스는 같이갈수없음
	
	//static F f1 = new F();
	static G G1 = new G();
	
	//생성자
	
	
	//메소드
	//인스턴스 메소드
	void method1() {
		F f = new F();
		G g = new G();
	}
	
	
	//정적 메소드
	
	static void method2() {
		//F f = new F();
		G g = new G();
	}
	
	
	//인스턴스 멤버 클래스
	class F {}
	
	//정적 멤버 클래스
	static class G{}
	
	
	
	

}
