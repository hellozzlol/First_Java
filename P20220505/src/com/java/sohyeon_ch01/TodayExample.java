package com.java.sohyeon_ch01;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TodayExample {
	
	//if,중첩if,else,while복습,try,catch 구문 복습 20220505

	public static void main(String[] args) {
		
		int score = 0;
		char grade =  ' ';
		
		
			while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("    점수를 입력하세요.>>>>>>>>> ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				score = sc.nextInt(); 
				if(score>=90) {
					grade = 'A';
				}else if(score>=80) {
					grade = 'B'	;	
				}else if(score>=70) {
					grade = 'C';
						
			   }else {
				   grade = 'D';
			   }
			  System.out.println("당신의 학점은" + grade + "입니다");
				
			}catch (NumberFormatException e) {
				
				
				System.out.println("숫자만 입력해주세요" + e.getMessage());
				
		    	
			
			}catch(InputMismatchException e) {
		    	System.out.println("숫자만 입력해주세요.");
                   
		    	 
			}catch(Exception e) {
		    	System.out.println("숫자만 입력해주세요.");
			
			
				
				
			}
				
			
			
			
			
			
			}
			
		
	}

			
}
	



