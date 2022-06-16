package com.yedam.java.ch10_01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		//a100은 숫자로 변환할수 없다는뜻 숫자로 변환할려니까 문자가 있어서 숫자로 변환이 ㄴㄴ
		//모든 숫자열을 숫자로 바꿀순 없음 , 숫.자.만. 있는 것 만 가능 
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		
		int result = value1 + value2;
		
		System.out.println(data1+"+"+data2+"+"+"="+result);
	}

}
