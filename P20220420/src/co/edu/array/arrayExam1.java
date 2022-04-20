package co.edu.array;

import java.util.Scanner;

public class arrayExam1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		
	//1. 1~100까지의 데이터를 넣는 배열에서 3의 배수만 출력
	
		int[]ary =new int[100];
		
		    Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		    System.out.println("3의 배수를 구하시오");
		
		for(int i =0; i<ary.length; i++) {
			ary[i] = i+2;
		}
		
		for(int i =0; i<ary.length; i++) {
			
			ary[i] = i+1;
		}
		
		for(int i=0; i<ary.length; i++) {
			
			if(ary[i] % 3 ==0) {
				System.out.println("3의배수"+ary[i]);
				if(ary[i]%2==0)
					System.out.println("3의배수 중 에서 짝수만 출력 " + ary[i]);
	
		
				
				
		//2. 1~100까지의 데이터를 넣는 배열에서 짝수만 출력
				
				
				
				
				
			}
		}
	}
	
		
		
}
