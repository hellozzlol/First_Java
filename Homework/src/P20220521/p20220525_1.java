package P20220521;

import java.util.Scanner;

public class p20220525_1 {

	public static void main(String[] args) {
		
		//문제1 차례대로 x와 y 값이 주어졌을때 어느 사분면에 해당되는지 출력하도록 구현
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
	
		int y=sc.nextInt();
		
		if(x>0) {
			if(y>0) {
				System.out.println("제 1사분면");	
				}
			else {
				System.out.println("제 4사분면");
			}
		}
		
		else {
			if(y>0) {
				System.out.println("제 2사분면");
			}
			else {
				System.out.println("제 4사분면");
			}
		}
	}

	
}