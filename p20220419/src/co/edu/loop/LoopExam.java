package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {
		int sum = 0;
		
		sum += 1;
		sum += 2;
		sum += 3;  // 이렇게 다 더하기 힘드니까 밑에 for문으로 줄여서 씀
		sum += 4;
		sum += 5;
		
		System.out.println("1~5의 합 : " + sum);
		
		
		//1~5까지의 합을 만들어보는 프로그램
		for(int i= 1; i<=5; i++) {
			//첫번째 sum = 0
			// 1) i=1, 0 = 0 + 1; -> sum = 1;
			// 2) i=2, 1 = 1 + 2; -> sum = 3;
			// 3) i=3, 3 = 3 + 3; -> sum = 6;
			// 4) i=4, 6 = 6 + 4; -> sum = 10;
			// 4) i=5, 10 = 10 + 5; -> sum = 15;
			sum = sum + i;
			
		}
		
	//구구단, 2단 만들기
		for(int i = 1; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				
		System.out.println(i+" * " + j +" = "+ i*j);
				
			}
			
		}
		
		for(int i = 1; i<=100; i++) {
			if(i%2==1 ) {
				System.out.println("홀수 : "+i);
			}
			else if(i%2==0) {
				System.out.println("짝수 : "+i);
				
			}
		}
		
		//*
		//**
		//***
		//****
		//*****
		//******
		
		// *****
		// ****
		// ***
		// **
		// *
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		
		
		
		
		
		
		for(int i =1; i<6; i++) {
			
			for(int j=1; j<=i; j++) {
			 System.out.print("*");
				
			}
			System.out.println();
		}
			
		//*****
		//****
		//***
		//**
		//*
		
		
		for(int i =1; i<6; i++) {
			for(int j=5; j>=1; j--) {
				if(i<j) {
				System.out.print("*");
			}
				System.out.println();
				
			System.out.println(" ");
		}
				
			
				
				
						}
							
					}
				}
			
				
				

