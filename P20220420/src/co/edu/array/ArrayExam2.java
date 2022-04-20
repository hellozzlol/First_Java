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
			// 1. 학생 수 => 배열 크기 설정
			// 2. 점수 입력 => 배열 데이터 입력
			// 3. 점수 리스트 => 배열 데이터 출력
			// 4. 분석 => 최대값, 평균 구하기
			// 5. 종료 => 반복문 종료

			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택>");

			int selcetNo = Integer.parseInt(sc.nextLine());
			// swich

			if (selcetNo == 1) {

				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];

			} else if (selcetNo == 2) {
				System.out.println("2.점수입력");
				int num = Integer.parseInt(sc.nextLine());
			} else {
				System.out.println("잘못된 입력 값");
			}

			{

			}

		}
	}

}
