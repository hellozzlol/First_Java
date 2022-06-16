package com.yedam.java.ch09_01;

public class Ouuter {
	
	String field = "Ouuter - field";
	void method() {
		System.out.println("Ouuter-method");
	}

	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-field");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Ouuter.this.field);
			Ouuter.this.method();
		}//우선적으로 내부 필드의 값을 알려줌 //this는 해당되는 메ㅐ소드를 알려줌
	}
	
	
}
