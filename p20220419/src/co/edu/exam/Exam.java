package co.edu.exam;

import java.util.Scanner;

class Exam {

	public static void main(String[] args) {
		// 1.화씨를 섭씨로 변환 하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨를 입력하세요");
		int c_temp = sc.nextInt();
		System.out.printf("%.2f\n",5/9.0*(c_temp-32));
		

		
		//2. 가위(0) 바위(1) 보(2)
		//0,0 | 0,1 | 0,2
		//1,0 | 1,1 | 1,2
		//2,0 | 2,1 | 2,2
		
		System.out.println("가위(0) 바위(1) 보(2)");
		int user = sc.nextInt();
		int random = (int)(Math.random()*3)+1;
		
		switch (user) {
			case 0:
				if (random == 1) {
					System.out.println("졌습니다.");
				} else if (random == 2) {
					System.out.println("이겼습니다");
				} else {
					System.out.println("비겼습니다");
				}
				break;
		}
	}
}
					
		
			
		
