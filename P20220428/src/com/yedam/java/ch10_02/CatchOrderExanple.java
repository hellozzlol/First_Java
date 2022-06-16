package com.yedam.java.ch10_02;

public class CatchOrderExanple {
public static void main(String[] args) {
			

	
	try {
			String data1 = args[0];
			String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1+value2;

		
		System.out.println(value1+"+"+value2+"=" +result);
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");// 밑 에 캐치 구문에 부모클래스를입력
		
		}catch(Exception e){//무조건 exception 보다 앞에 있어야함
			System.out.println("다시실행해주세요.");
		}finally {
			System.out.println("항상 실행!");
		}
	
	
	
	
	

}
}
