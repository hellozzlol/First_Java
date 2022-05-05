package com.java.sohyeon_ch01;

public class TodayExample1 {
//예외처리 복습 20220505
	public static void main(String[] args) {
	    System.out.println(1);
	    int[] scorse = {10,20,30};
	    try {
	    	System.out.println(2);
	    	//System.out.println(scorse[3]);
	    	System.out.println(3);
	    	System.out.println(2/0);	
	    	System.out.println(4);
	    }catch(ArithmeticException e) {
	    	System.out.println("계산이 잘못된 것 같아요");
	    }catch(Exception e) {//e는 변수라 내 맘대로 정해도 댐 
	    	System.out.println("뭔가 이상합니다 오류가발생했습니다.");
	    }
	    System.out.println(5);
	    
	    
	    }
	    
	    
	}


