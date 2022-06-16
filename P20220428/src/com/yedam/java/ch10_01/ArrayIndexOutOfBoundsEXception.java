package com.yedam.java.ch10_01;

public class ArrayIndexOutOfBoundsEXception {
//배열에인덱스 범위초과할때 보는 오류
	public static void main(String[] args) {
		
		//메인메소드옆에 보면매개변ㅅ수가앗음.
		
		if(args.length ==2) {
		
	String data1 = args[0];
	String data2 = args[1];
	
	System.out.println("args[0]"+data1);//비정상적으로 종료
	System.out.println("args[1]"+data2);//실행되지 않음.
	
	
	//9번째 줄에서 예외가 되면서 비정상적으로 종료 밑줄을 실행되지 않음.
		
		}else {
			System.out.println("매개변수를 2개 입력해주새요.");
		}

	}

}
