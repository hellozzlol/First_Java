package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) {
		
		//String 생성자 : byte타임 -> String 타입,디코딩(사람이이해할수잇는걸로)
		//getByte 메소드 : String타입 - > byte 타입,인코딩(컴퓨터가 인식해주는게 인코딩)
		
		String str ="안녕하세요";
		//한글로 거의 안쓰고 타입변환해야ㅕ함
		
		byte[] strBytes1= str.getBytes();
		System.out.println(strBytes1);//b어쩌고나오는건 16진수로 표기//저대로 데이터가 넘어감(인코딩)
		String str1 = new String(strBytes1);//다시 사람이 알아볼수있도록 처리(디코딩)
		System.out.println(str1);
		
		
		try {
			byte[] strBytes2 = str.getBytes("EUC-KR");
			System.out.println("strByte2의 길이 : " + strBytes2.length);
			
			String str2 = new String(strBytes2,"EUC-KR");
			System.out.println("strbyte2->String : "+str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		//한국에서 거의 사용안함 //기존에 디폴트로 도ㅣ어있는게 아니라 개발자가 정해줌//자바입장에선 개발자가 정해준거 실행해서 알아야하고 오류나면u으로 시작하는문구출력
		//디코딩 인코딩 할때 기준점이 같아야함.

	}

}
