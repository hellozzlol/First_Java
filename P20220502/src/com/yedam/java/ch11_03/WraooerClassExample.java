package com.yedam.java.ch11_03;

public class WraooerClassExample {

	public static void main(String[] args) {
		
		//Boxing
		Integer obj1 = Integer.valueOf(300);
		Integer obj2 = Integer.valueOf("300");
		
		
		//Unboxing
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		// 자동 Boxing
		//값을 넣으면 자동으로 변환
		Integer obj = 100;//-> heap영역에 새로운 객체생성
		System.out.println("value : " +obj.intValue());

		//obj가 참고하고있는건 객체
		//벨류는 내부값을 넘겨줌
		//대입 시 자동 Unboxing
		int value = obj;//->heap영역에 있는 객체의 값을 복사
		System.out.println("value : " + value);
		
		//연산시 자동 Unboxing
		
		int result = obj + 100;//->100+100
		System.out.println("result : " + result);
		//연산을 일으킬때 obj가 내부 값을 던져줌 그래서 100+100이되서 값이 200이나옴
		
		//포장 객체 비교
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3==obj4));
		System.out.println("언박싱 후 ==결과 : " + (obj3.intValue()==obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
		
		
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj5 = 300;
		Integer obj6 = 300;
		System.out.println("==결과 : " + (obj5==obj6));
		System.out.println("언박싱 후 ==결과 : " + (obj5.intValue()==obj6.intValue()));
		System.out.println("equals() 결과 : " + obj5.equals(obj6));
		
		
		
		
		
	}

}
