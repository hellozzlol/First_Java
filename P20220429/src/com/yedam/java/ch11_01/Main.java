package com.yedam.java.ch11_01;

public class Main {

	public static void main(String[] args) {
		
		//String str1 = new String("홍길동");
		//String str2 = new String("홍길동");
		
		//이름은 "홍길동"같지만 새로운객체라고 자바는 인식합니다.
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				
				//return;//메인에서 사용될때만 엑시트랑 같은 역할함
				//break;//브레이크는 포문을 벗어나서 그냥 밑에출력
				System.exit(0);//엑시트에 있는 숫자는 아무런 의미는 없음,
		
			}
		}
		System.out.println("마무리 코드");
		
	}

}
