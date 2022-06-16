package com.yedam.java.ch_08_01;

public interface RemoteControl {
	//상수필드
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상메소드
	
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume( int volume);

}
