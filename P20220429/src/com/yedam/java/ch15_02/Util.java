package com.yedam.java.ch15_02;

public class Util { //메서드에서 제네릭타입을 쓸때는 리턴되는타입 앞에 선언해야함.<전부다 T로선언>
	
	public static <T> Box<T> boxing (T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
		
	}

}
