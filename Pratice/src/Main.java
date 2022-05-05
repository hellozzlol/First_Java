import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
				
		//System.out.println("1.학생이름 2.학번 3.국어 4.영어 5.수학 6.합계 7.평균 8.종료");
		
		//System.out.println("------------------------------입력하세요->>>>>>-----------------");
		
		
		//System.out.println("강철부대원픽 고르기");
		
		
		
		//System.out.println("-------------------------------------------------------");
		
		
	
		
		
		
//System.out.println("-----------------------------------------------------");
		
		
		//System.out.println("1.권호제 2.윤종진 3.구민철 4.명단단");
		
		
		
		/*System.out.println("-------------------------------------------------------");
		
		
		
		
		/*String str1 = 20 + 2+"8";
		System.out.println("Str1 : " + str1);
		
		String str2 = "20" + (2+8);
		System.out.println("Str2 : " + str2);
		
		String str3 = 20 + "2"+8;
		///System.out.println("Str3 : " + str3);*/
		
		//int value1 = Integer.parseInt("10");
		//double value2 = Double.parseDouble("3.14");
		//boolean value3 = Boolean.parseBoolean("true");
		
		//System.out.println("value1 : " + value1);
		//System.out.println("value2 : " + value2);
		//System.out.println("value3 : " + value3);

		
		
		
	    //int x = 5;
		//int y = 2;
		
		//int result = x/y;
		
		//System.out.println(result);
		
		//int x = 5;
		//int y = 2;
		
		//double result = (double)x/y;
		
		//System.out.println(result);

		
		
		//소숫점 날리는 코드
	//	double var1 = 3.5;
		//double var2 = 2.7;
		
		//double Value = (double) 3.5+2.7;
		
		//System.out.println("var : "+ (int)Value );
		
		
	//int[] socre;// 1.배열의 socre를선언.(참조변수선언)
		//score = new int[5]; // 2.배열생성(int 저장공간 *5)
	
		/*int[] score = new int[5];//배열의 선언과 생성을 한줄로 입력
		
		score[3] = 100;
		System.out.println("score[0]=" +score [0]);
		System.out.println("score[1]=" +score [1]);
		System.out.println("score[2]=" +score [2]);
		System.out.println("score[3]=" +score [3]);
		System.out.println("score[4]=" +score [4]);
*/
		
		///int[]arr = new int[5]; //배열의 길이가 5인 int 배열 arr
		
		//System.out.println("arr.lengh =" + arr.length);
		
		//for(int i = 0; i<arr.length;i++) {//인덱스 범위초고ㅏ나서 에러
			//System.out.println("arr["+i+"] = "+ arr[i]);
		//}
		
//int value = score[3];
//System.out.println("value"+value);


	//int[] iArr ={100,95,80,70,60};
	//for(int i=0 ; i<iArr.length;i++) {
		//System.out.println(iArr[i]);

		//System.out.println(Arrays.toString(iArr));//ㅕArray 구문을 쓰면 빨간줄이 나오는데 import가 없어서 그럼
		//컨트롤쉬프트 알트 누르면 해결
	
	
	 
	 
	 
	 
	
		int[]lotte = new int[45];
	
	for(int i=0; i<lotte.length; i++)
		
		lotte[i] = i+1;
	
	
		int a = 0;
		int j = 0;
		
		for(int i=0; i< 6; i++) {

			j=(int)(Math.random()*45);
			a= lotte[i];
			lotte[i]=lotte[j];
			lotte[j]=a;
			
		System.out.printf(" 행운의 숫자는? [%d] =%d%n ",i,lotte[i]);
		
		
				
		}
	}
	
	
		//집가서 자바의 정석 ch-5  16-17들어야함 
	}
	

//java 에서 and 는 && or 은 ||입니다.
 