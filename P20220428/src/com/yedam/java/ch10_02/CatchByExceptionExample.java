package com.yedam.java.ch10_02;

public class CatchByExceptionExample {

	public static void main(String[] args) {
		
		try {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할수 없습니다.");
		}finally {
			System.out.println("항상 실행!");
			
		}

	}

}
// 실행 매개 값의 수가 부족합니다
// 숫자로 변환 할수 없습니다
// 항상 실행!

//arry거쳐서number 거쳐서 마지막으로 finally로 올 것 같습니다

//왜지? 나는 왜 항상실행만 뜨지?>