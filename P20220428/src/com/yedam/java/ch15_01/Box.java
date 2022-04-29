package com.yedam.java.ch15_01;

public class Box<T> {
//스트링이 <T>	
	
	
	
	//private Object object;
	
	private T t; //스트링이 <T>

	//public Object getObject() {return object;}
	
	public T get() {return t;}//스트링이 <T>
	
	

	//public void setObject(Object object) {	this.object = object;}
	
    public void set(T t) {this.t = t;}//스트링이 <T>
	
	//한번<> 스트링으로 고정하면 내부가 스트링으로 도배된다.
	

}
