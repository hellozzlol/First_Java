package com.yedam.java.ch15_01;

public class BoxExample {

	public static void main(String[] args) {
		/*
		Box box = new Box();
		
		box.setObject("홍길동");
		String name = (String)box.getObject();
		System.out.println(name);
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
*/
		
		
		//스트링만 받을수 있음
		Box<String> stringBox = new Box<String>();
		
		stringBox.set("홍길동");
		String name = stringBox.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		
		Apple apple = appleBox.get();
		//새로운 박스를 못받음.
	}

}
