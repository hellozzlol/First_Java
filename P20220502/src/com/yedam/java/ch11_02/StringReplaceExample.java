package com.yedam.java.ch11_02;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다";
		String newStr = oldStr.replace("자바", "JAVA");//바꾸고자 하는 문장을 두ㅣㅏ에넣어
		
		
		
		
		
		System.out.println(oldStr);//기존에 있던걸로 바꾸고 싶으면 old로 바꾸면 된다//old를 이용한 새로운 스트링이 만들게 되서 동일한 이름의 객체가 두개생김
		System.out.println(newStr);//"Stringbuilder" 여러번 수정하고싶을때 쓰는거 즉 스트링을 구축하는 시스템(동일한 이름의 객체가 두개생기니깐 메모리 손실이 일어남 그때 쓰는게 앞에 ""으로된거.)
		

	}

}
