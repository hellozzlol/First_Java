package com.yedam.java.ch11_02;

public class StringBuilderExample {
	//그 메모리 안에서 수정
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());//조합해서 끝에 최종으로 출력함
		
		//해당 인덱스위치에  앞 에 값을 삽입
		sb.insert(4,"2");
		System.out.println(sb.toString());
		
		
		
		//해당 인덱스위치에 값을 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		
		
		//시작 인덱스 부터 끝 지정한 인덱스 전 까지 지정해서 대체
		sb.replace(6, 13,"Book");
		System.out.println(sb.toString());
		
		
		//시작 인덱스 부터 지정한 인덱스 전 까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		
		int lenght = sb.length();
		System.out.println("총 문자 수 : " + lenght );
		
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString());
		
		//반드시 연산을 해줘서 종료를 해줘야함 윗줄 처럼 
		
		
		

	}

}
