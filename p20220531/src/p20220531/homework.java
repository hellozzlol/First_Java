package p20220531;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// 문제) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 최고가격 가지는 제품-전체제품
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner sc = new Scanner(System.in);

		// 가격을 int
		// 상품명을...string?

		boolean run = true;

		// int product = 4;
		int product = 4;

		int[] arr = new int[4];

		String[] strArray = new String[4];
		String tv1 = "tv1";
		String tv2 = "tv2";
		String tv3 = "tv3";
		String tv4 = "tv4";

		while (run) {
			System.out.println("=======================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=======================================================");
			System.out.println("선택>");

			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				System.out.println("1.상품수 > " + product + "개");
				product = sc.nextInt();
				// 상품갯수 변수값 4개로 설정
			case 2://for문 수정할거 product 부분 int i=0으로 바꾸고 가격도 같이 넣어서 출력
				System.out.println("2.상품 및 가격입력");
				System.out.println("상품 명 을 입력해주세요>");
				for (int i = 0; i < strArray.length; i++) {
					sc.nextLine();
				}

				System.out.println("제품 가격 을 입력해주세요>");
				for (int j = 0; j < arr.length; j++) {
					arr[0] += sc.nextInt();

					// arr[0]+=sc.nextInt();
				}

			

			case 3://여기도 for문 돌리기
				System.out.println("3.제품별 가격 > ");
				System.out.println("상품명 : " + tv1 + " " + "상품가격 : " + arr[0]);
				System.out.println("상품명 : " + tv2 + " " + "상품가격 : " + arr[1]);
				System.out.println("상품명 : " + tv3 + " " + "상품가격 : " + arr[2]);
				System.out.println("상품명 : " + tv4 + " " + "상품가격 : " + arr[3]);

			case 4:
				System.out.println("4.분석 > ");
				int sum = arr[0];
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
				System.out.println("합계금액 " + sum);
				int max = arr[0];

				for (int i = 0; i < arr.length; i++) {
					if (max < arr[i]) {
						max = arr[i];
					}

				}
				System.out.println("최대금액" + max);
				sc.close();

			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}

		}

	}

}
