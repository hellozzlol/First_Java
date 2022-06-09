package P20220531;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// 1.배열생성

		String[] names = new String[4];
			int size = names.length;
	
		// 2.입력받기

		Scanner put = new Scanner(System.in);

		// 3.입력된 이름을 배열에 순서에 맞게 저장
		for (int i = 0; i < size; i++) {

			System.out.print("상품명을 입력하세요. ");

			names[i] = put.next();

		}
		for (int i = 0; i < size; i++) {

			// 4.화면에 입력된 이름을 표시한다.
			System.out.println("상품이름: " + names[i]);

		}

		for (int i = 0; i < size; i++) {

			// 4.화면에 입력된 이름을 표시한다.
			System.out.println("상품가격: ");

		}

	}

}
