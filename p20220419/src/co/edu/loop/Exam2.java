package co.edu.loop;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		
		//1. 최소, 최대 값 구하기... scanner -> 3개
		// 최대값, 최소값을 구해 보는 반복문
		//2. 두 주사위를 던졌을때 주사위 합이 6인 데이터 출력
		// 두 주사위 =>  데이터 2개 => 합이 6
		//3. 피보나치 수열(while(value <50))
		// 1, 2, 3, 5, 8, 13
		
		//1.
		Scanner sc = new Scanner(System.in);
		
		int frist, second, third, max1;
		
		
		System.out.println("1~3");
		int min1= 1;
		int mid = 2;
		int max11 = 3;
		System.out.println("최소값은?");
		if(min1>3);
		System.out.println("최댓값은?");
		if(max11<3);
		
		//2. 
		for(int i = 1; i<=6; i++) {
			int randomValue = (int)(Math.random() * 6) + 1;
			int randomValue2 = (int)(Math.random() * 6) +1;
			if(randomValue + randomValue2 ==6);
				System.out.println("주사위 : "+randomValue+"," + randomValue2 + " = " + (randomValue+randomValue2));
				
				
				
				
				
		//3. 
				


		}
		
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		while(num3 <50);{
		
		num3 = num1 + num2;
		{
			{num3 = num1 + num2;				

			System.out.println(num1 +"," + num2 +" = " + num3);
			
			num1 = num2;
			
			num2 = num3;
	
	}
}
		}}
	}
