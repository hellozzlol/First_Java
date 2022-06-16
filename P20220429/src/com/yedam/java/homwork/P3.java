package com.yedam.java.homwork;

public class P3 {
	public static void main(String[] args) {

		method(true);
		method(false);

	}
	
	public static void method(boolean value){
		
		try {
		    System.out.println(1);
		
		    if(value){
			throw new RuntimeException();
		}
		
		System.out.println(2);
		}catch(RuntimeException e) {
			System.out.println(3);
			return; //흐름상메소드를 종료할때 씀.
		}catch(Exception e){
		System.out.println(4);
		}finally { 
		System.out.println(5);//finally는 무조건 실행댐 
		}
		System.out.println(6);
	}
	
}
	
	
	


