package co.edu.IO;

import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		//데이터 입력을 받기 위해 scanner 선언 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("스캐너를 값을 입력하세요.");
		String str = sc.nextLine();
		//int value = sc.nextInt();
		System.out.println("입력값 : " + str);
		
		while(true) {
			System.out.println("스캐너 값을 입력하세요.");
			String str1 = sc.nextLine();
			System.out.println("입력값 : " + str1);
			if(str1.equals("q")) {
				break;
			}
		}
		
		//컨트롤+쉬프트 O (스캐너내용)
		// 괄호 안 내용 출력
		//System.out.println(false);
		// 괄호 안 내용 출력 후 엔터
		//System.out.println();
		// 괄호 안의 내용 커스텀해서 출력
		//System.out.printf(null, args);
		//printf 정수
		//int value = 123;
		//System.out.printf("%d?\n", value);//백슬러시앤을쓰게되면 엔터키 %자리에 출력값쓰고 n를서서 한줄 띄울거다
		//System.out.printf("%5d?\n", value);//앞에 공백처리
		//System.out.printf("%-5d?\n", value);//뒤에 공백처리
		//System.out.printf("%05d?\n", value);//앞에 공백이생기면 00으로 채워줘
		
		//printf 실수
		//double value2 = 12.123;
		//System.out.printf("%.2f\n" , value2);
		//System.out.printf("%9.4f\n" , value2);//9자리중에서 소숫점4개 다채워주고 남은공백처리(남은공백은 0)
		//System.out.printf("%-9.0f\n" , value2);//총 9자리 나타내는데 내가넣은데이터에 대한 공백이 발생하면 내 뒤에 공백처리
		
		
	
	}

}
