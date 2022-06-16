package com.yedam.java.homwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2{
	public static void main(String[] args) {
	int answer = (int) (Math.random() * 100) + 1;
	
	// 사용자입력을 저장할 공간
	int input = 0; 

	// 시도횟수를 세기 위한 변수
	int count= 0;
	
	
	do{	//출력결과를 실행하는 코드부분 
		
		
		//시도한 횟수를 증가
		count++;
		
		//사용자가 숫자를 입력
		
		
		
		try {
			
		input = new Scanner(System.in).nextInt();
		}catch(InputMismatchException e) {
			System.out.println("유효하지 않은 값입니다. 다시값을입력해주세요");
			continue;
		
		}
		
		
		//-> 숫자 이외의 값을 입력할 경우 예외처리
		
		//컴퓨터가 가지고 있는 숫자 > 사용자가 입력한 숫자
		//->"더 큰수를 입력하세요."
		
		
		if(answer < input) {
			System.out.println("더 작은수를 입력하세요.");
		}
		//컴퓨터가 가지고 있는 수자 < 사용자가 입력한 숫자
		//->"더 작은수를 입력하세요."
		else if(answer > input) {
			System.out.println("더 큰 수 를 입력하세요");
		}
		
			
		//컴퓨터가 가지고 잇는 숫자 = 사용자가 입력한 숫자
		//->"맞혔습니다."
	else if( input == answer){
		System.out.println("맞혔습니다.");
		
		break;
	}
		
		//->시도횟수를 출력
		
	else if( input == answer){
		System.out.println("시도횟수는  : " +count + "번 입니다.");
		break;
	}
		
	}while(true);

}
}
				
				
				
	
	