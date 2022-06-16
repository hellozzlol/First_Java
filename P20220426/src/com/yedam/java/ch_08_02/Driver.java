package com.yedam.java.ch_08_02;

public class Driver {
	
	public void driver(Vecicle vechicle) {
		if(vechicle instanceof Bus) {
		Bus bus = (Bus) vechicle;
		bus.checkFare();
		
		
	}
		vechicle.run();
	}
}
//메모리상에 바퀴 라는 변수가 있고 인스턴스가 생성되고 연결댐 런을 시작했을때 
//맨처음 만나는 코드가 강제타입변환 버스라는 변수가 하나 더생김 그러면 타입변환되는 이유 는? 그냥 연결해줌
//그냥 공유해준다 생각하면된다 인스턴스는 동일 인스턴스를 참조하는 애가 버스냐 바퀴냐의 차이,