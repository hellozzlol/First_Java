package P20220531;

import java.util.Scanner;

public class p20220531 {

	public static void main(String[] args) {
		// 문제) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		// 가격을 int
		// 상품명을...string?

		boolean run = true;

		// int product = 4;
		 String[] names = new String[4];

	        int size = names.length;
	        
		//2.입력받기
		Scanner sc = new Scanner(System.in);
		
		 
		
		// String tv1 = "tv1";
		// String tv2 = "tv2";
		// String tv3 = "tv3";
		// String tv4 = "tv4";


		while (run) {
			System.out.println("=======================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=======================================================");
			System.out.println("선택>");

			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				for(int i =0; i<size; i++) {
					System.out.println("저장하실 상품 갯수를 입력 : "+names);
					names[i] = sc.next();
				}
				
				for(int i =0; i<size; i++) {
					System.out.println("저장할 상품갯수 > "+names[i]);
				}
			case 2:
				 for(int i=0; i<size; i++){

				        System.out.print("상품명을 입력하세요. ");

				         names[i] = sc.next();            

				        }

				          for(int i=0; i<size; i++){

				    //4.화면에 입력된 이름을 표시한다.

				        System.out.println("상품이름: " +names[i]);

				    }
				
		

			case 3:
				System.out.println("3.제품별 가격 > ");
				System.out.println("상품명 : " + names + " " + "상품가격 : " );
				System.out.println("상품명 : " + names + " " + "상품가격 : " );
				System.out.println("상품명 : " + names + " " + "상품가격 : " );
				System.out.println("상품명 : " + names + " " + "상품가격 : " );

			case 4:
				System.out.println("4.분석 > ");
				//t sum = arr[0];
				//r (int i = 0; i < arr.length; i++) {
					//m += arr[i];
				//
				//stem.out.println("합계금액 " + sum);
				//t max = arr[0];

				//r (int i = 0; i < arr.length; i++) {
					//if (max < arr[i]) {
						//max += arr[i];
				//	}

				//}
				//System.out.println("최대금액" + max);
				sc.close();

			case 5:
				run = false;
				break;
			}

		}

		System.out.println("프로그램 종료");

	}

}
