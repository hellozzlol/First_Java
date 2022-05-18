package P20220427;

public class P20220518 {

	public static void main(String[] args) {
		
		
		System.out.println("1번문제입니다.");
		
		int a = 37;
		int b = 91;
		System.out.println("변수명 1 : "+ a +  " 변수명 2 : " + b);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("2번문제입니다.");
		
		System.out.println(b+a);
		System.out.println(b-a);
		System.out.println(b*a);
		System.out.println(b/a);
		
		System.out.println("----------------------------------------------------");
		System.out.println("3번문제입니다.");
		
		
		int var1 = 128;
		String var2 = "B";
		int var3 = 44032;
		long var4 = 100000000000L;
		double var5 = 43.93106;
		double var6 = 301.3;
		
		System.out.printf("%d ,int\n" ,var1);
		System.out.printf("%s ,String\n",var2);
		System.out.printf("%d ,int\n",var3);
		System.out.printf("%d ,long\n",var4);
		System.out.printf("%8.5f ,double\n",var5);
		System.out.printf("%5.1f  ,double\n",var6);
		
		
		System.out.println("----------------------------------------------------");
		
		
		
		System.out.println("4번 문제입니다");
		
		byte a1 = 35;
		byte b2 = 25;
		int c = 463;
		long d = 1000L;

		long result1 = a1+c+d;
		System.out.println(result1);
		
		long result2 = a1+b2+c;
		System.out.println(result2);
		
		double e = 45.31;
		
		double result3 = c+d+e;
		
		System.out.println(result3);
		
		
		System.out.println("---------------------------------");
		
		System.out.println("5번문제입니다.");
		
		//출력값은 A278번지10.0 이나와야함 
		
		int intValue1 =24;
		int intValue2 =3;
		int intValue3 =8;
		int intValue4 =10;
		char charValue = 'A';
		String strValue = "번지";
	
		
		String str = String.valueOf(charValue);
		
		
		String strResult = str+((intValue1+intValue2)+intValue1*intValue4+
				intValue3+intValue2+strValue+intValue4+".0");
		
		System.out.println(strResult);
		
		
		
		
		
		System.out.println("------------------------------------------------");
		
		
		System.out.println("6번째 문제 입니다");
		
		//문제6) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 
	   // 예시) 373 일 경우 3 + 7 + 3 = 13 으로 결과는 13입니다. */
	     int value = 485;
	     int result = 0;
	     
	     while(value>0) {
	    	 result+=value%10;
	    	 value = value/10;}
	     System.out.println(result);
	     }
		
		
		
		
	}


