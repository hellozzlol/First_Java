package com.yedam.java.ch09_01;

public class OuuterExample {

	public static void main(String[] args) {
	 
		Ouuter ouuter = new Ouuter();
		Ouuter.Nested nested = ouuter.new Nested();
		nested.print();

	}

}
