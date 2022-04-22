package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------------------");
			// 1. 학생 수 => 배열 크기 설정 // 2. 점수 입력 => 배열 데이터 입력 // 3. 점수 리스트 => 배열 데이터 출력
			// 4. 분석 => 최대값, 평균 구하기 // 5. 종료 => 반복문 종료

			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택>");

			int selcetNo = Integer.parseInt(sc.nextLine());
			// swich;
			
			if(selcetNo == 1) {
				System.out.println("학생수를 입력 하시오.");
				studentNum = Integer.parseInt(sc.nextLine());
				System.out.println("학생수 가 입력되었습니다.");
				scores = new int[studentNum];
				
			
			} else if(selcetNo ==2) {
				//작성위치
				for(int i = 0; i<scores.length; i ++) {
					scores[i] = Integer.parseInt(sc.nextLine()); //점수입력값
					System.out.println("점수가 입력되셨습니다..");
				
				}
				
				
			} else if(selcetNo ==3) {
				for(int i = 0; i<scores.length; i ++) {
					System.out.println("scores["+ i + "]>"+ scores[i]);
				
				}
				
				
				
			} else if(selcetNo ==4) {
				
					int sum =0;
					for(int i =0; i<scores.length; i++) {
						sum += scores[i];
					}
					int avg = sum /scores.length;
					System.out.println("합계"+sum);
					System.out.println("평균"+avg);
					
			} else if(selcetNo ==5) {
				run = false;
				System.out.println("프로그램 종료");

			}

		}
	}



	private static int nextLine() {
		return 0;
	}
}
