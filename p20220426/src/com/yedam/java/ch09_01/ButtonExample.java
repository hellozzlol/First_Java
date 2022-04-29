package com.yedam.java.ch09_01;

public class ButtonExample {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListenner(new CallListener());
		button.touch();
		
		button.setOnClickListenner(new MessageListener());
		button.touch();

	}

}
