package com.yedam.java.ch15_02;

public class BoxingExample {

	public static void main(String[] args) {
		
		//제너럴타입으로 뭘넘길지 생각
		
		Box<Integer> box = Util.<Integer>boxing(100);
		//메소드 앞에 꺽새로 결정지어주고,,,,,
		int intValue = box.getT();

		
	Box<String> strbox	 =Util.<String>boxing("홍길동");
	String strvalue  = strbox.getT();
		
	}

}
