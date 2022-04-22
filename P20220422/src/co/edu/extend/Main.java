package co.edu.extend;

public class Main {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("고아라폰", "white", 100);
		
		// 부모클래스 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.hangUp();
		
		// 자식 클래스 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.turnOffDmb();
		
		//부모클래스 메소드
		dmbCellPhone.powerOff();
		
		// 부모클래스 필드 출력
		System.out.println(dmbCellPhone.color);
		System.out.println(dmbCellPhone.model);
		
		// 부모 클래스 
		Calculator cal = new Calculator();
		cal.areaCirecle(50);
		
		Computer com = new Computer();
		com.areaCirecle(60);
		
		
		//자동 타입 변환(클래스간)
		Member mem = new Person();
			//부모  =   //자식
		
	}

}