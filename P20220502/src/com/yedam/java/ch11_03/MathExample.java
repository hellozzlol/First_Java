package com.yedam.java.ch11_03;

public class MathExample {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1); 
		System.out.println("v2 : " + v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : " + v3);//올림값은 오른쪽을
		System.out.println("v3 : " + v4);//ㄴ내림값은 왼쪽
		
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		
		System.out.println("v7 : " + v7);
		System.out.println("v8 : " + v8);
		
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
		
		double v11 = Math.random();
		System.out.println("v11 : "+v11);
		
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);//가까운 거리의 실수값//반올림이랑 똑같은 개념 
		
		System.out.println("v12 : " + v12);
		System.out.println("v13 : " + v13);
		
		long v14 = Math.round(5.3); //rint 와 round는 반올림하는건 같음 개념은 비슷 사용방법도 비슷 한데
		long v15 = Math.round(5.7);//그건 양수일때만 비슷하고 음수일땐 결과는 다름
		System.out.println("v14 : " + v14);
		System.out.println("v15 : " + v15);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;//tmp2가 정수타입이라 하나는 실수로 변환해줭함 .0으로
		
		System.out.println(v16);
		
		//rint 와 round() 차이
		//rint()는 짝수값에 넘어갑니다. 0.5면 두수의 중앙이라면 짝수값이 중간이 된다. 1.5면 2가 되느거고 0도짝수취급
		System.out.println("round(0.5) : " + Math.round(0.5));//정수
		System.out.println("rint(0.5) : " + Math.rint(0.5));//실수
		
		System.out.println("round(1.5) : " + Math.round(1.5));
		System.out.println("rint(1.5) : " + Math.rint(1.5));
		
		
		
		
		
		
	}

}
