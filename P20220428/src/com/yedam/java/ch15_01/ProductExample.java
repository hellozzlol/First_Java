package com.yedam.java.ch15_01;

import javax.print.DocFlavor.STRING;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Tv,String> product1 = new Product<Tv, String>();
		product1.setT(new Tv());
		product1.setM("스마트Tv");
		
		
		Tv tv = product1.getT();
		String tvMode1 = product1.getM();
		
		
	}

}
