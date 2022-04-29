package com.yedam.java.ch_08_01;

public class Myclass {
	
	//필드
	RemoteControl rc = new SmartTelevision();
	
	
	
	//생성자
	
	 Myclass(){
		 
	 }
	 
	 Myclass(RemoteControl rc) {
		 this.rc = rc;
		 this.rc.turnOn();
		 this.rc.turnOff();
		 
		 
		 
	 }
	
	
	
	//메소드
	
	void methodA( ) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

	public void methodB(RemoteControl rc) {
		
        	
		rc.turnOn();
		rc.turnOff();
		
	}
	
	

}
