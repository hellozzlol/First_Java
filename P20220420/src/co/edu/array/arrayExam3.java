package co.edu.array;

import java.util.Scanner;

public class arrayExam3 {

	public static void main(String[] args) {
		
		int[] ary1 = {9,8,6,9,5};
		
		
		//최대값 변수
		int max = 0;
		//최소값 변수
		int min = ary1[0];
		for(int i=0; i<ary1.length; i++) {
			//최대값 구하기
			if(max< ary1[i]) {
				max = ary1[i];
			}
			//최소값 구하기
			if(max> ary1[i]) {
				min = ary1[i];
			}
			
			
			
		}
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);
		
		
		Scanner sc = new Scanner(System.in);
		
		//배열은 만들되, 사이즈는 아직 정하지 않겠다.
		
		int[] ary2 =null;
		System.out.println("배열의 사이즈를 입력하세요.");
		//배열 사이즈 입력 한 값으로 배열 크기 설정
		int num = sc.nextInt();
		ary2 = new int[num];
		
		for(int i =0; i<ary2.length; i++) {
			//1~배열의 크기만큼 데이터를 입력
			ary2[i] = i+1;
		}
		
		for(int i=0; i<ary2.length; i++) {
			//2의 배수 구하기
			if(ary2[i] % 2 ==0) {
				System.out.println(ary2[i]);
				
				
				for(int i1=0; i1<ary2.length; i1++) {
					//홀수만 출력
					if(ary2[i1] % 2== 1) {
						System.out.println(ary2[i1]);
					}
				}
				
				
				int[] ary3 = new int[num];
				
				//ary2, ary3 배열을 총 2개 만듬.
				for(int i1=0; i1<ary3.length; i1++) {
					ary3[i1] = i1;
					
				}
				
				for(int i1 =0; i1<ary2.length; i1++) {
					for(int j=0; j<ary3.length; j++) {
						//조건  ary2의 데이터 + ary3의 데이터
						//ary2의 데이터 + ary3의 데이터
						if(ary2[i1]+ary3[j] < 10) {
							System.out.println("1." + ary2[i1] + "2. "+ary3[j]);
						}
						
						
						
						
					}
				}
			}
		}
		
	}


}
