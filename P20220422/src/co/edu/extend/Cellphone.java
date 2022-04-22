package co.edu.extend;

public class Cellphone {
	
	public String model;
	public String color;
	int channel;
	//생성자
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
		
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
       }
    void bell( ) {
    	System.out.println("벨이 울립니다.");
    }
    
    void turnOnDmb() {
    	System.out.println("채널" + channel + "Dmd 시작.");
    }
    void turnOffDmb( ) {
    	System.out.println("채널" + channel + "Dmd 종료.");
    	
    	
    }
    void hangUp() {
		System.out.println("전화를 끊습니다.");
    
    
    }
}