package com.yedam.java.ch11_02;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		//찾고자 하는 문자열을 찾아줌
		
		String subject = "자바 프로그래밍";
		String subject1 = "JAVA PROGRAMING";
		//프로그램이 시작되는 위치를 알려줌 0,1,2,3
       int location  = subject.indexOf("프로그래밍");
	    System.out.println(location);
	    
	    //실제로는 찾고자하는 글자가 내부에 있으ㅜ면 정수값을 주고 반대로 값이없으면 -1 반환
	    //실제로는 밑에처럼 씀
	    if(subject.indexOf("java")!=-1){
	    	System.out.println("자바와 관련된 책이군요.");
	    //자바는 대소문자 구분함.
	     }else {
	    	System.out.println("자바과 관련이 없는 책이군요.");
	    }
	 //공백도 자바입장에선 문자로인식

	}

}
