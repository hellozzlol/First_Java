package com.yedam.java.ch10_02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		//문자열로 넘겨받는데입력받을걸 클래스으로 가져와야하는데 클래스가없다 이말
		//정상적인 클래스값이 아닐수도있음.
		
		try {
	Class clazz = Class.forName("java.lang.String");
		}catch (ClassNotFoundException e) {
		System.out.println("존재하지 않는 클래스입니다.");	//따로 출력문구를 써줌
		}
	//class 빨간줄 부부분에 커서 가져다 대면  add어쩌고 뉴르면 try가 나옴
	//getMessage치면 오류가 사라짐	
	
	

	}

}
