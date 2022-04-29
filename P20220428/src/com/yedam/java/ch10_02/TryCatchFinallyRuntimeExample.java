package com.yedam.java.ch10_02;

public class TryCatchFinallyRuntimeExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		try {
		data1 = args[0];
		data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
	
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1+value2;

		
		System.out.println(value1+"+"+value2+"=" +result);
		
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환 할수 없습니다.");
		
		}finally {
			System.out.println("항상 실행!");
		}
		
		//발생하는 오류는 두가지.
		//이두개에 대해서 각각 처리하고싶음.
		//try문으로 처리해줌 
		
		
	    //실행 매개값의 수가 부족합니다.
		//숫자로 변환 할수없습니다. 라고 뜰것 같습니다.. 왜내하면 data1이 문자가 포함된거라 숫자로 변환이 안됩니다.,ㅠㅠㅠ아닌가,,,ㅠㅠ
		
	}

}
