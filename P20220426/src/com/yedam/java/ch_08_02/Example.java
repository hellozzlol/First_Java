package com.yedam.java.ch_08_02;

public class Example {

	public static void main(String[] args) {
		
		implememtationC impl = new implememtationC();
		
		InterFaceA ia = impl;
		ia.methodA();
		
		
		InterFaceB ib = impl;
		ib.methodB();
		
		InterFaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
