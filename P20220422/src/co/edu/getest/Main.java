package co.edu.getest;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		int speed = myCar.getSpeed();
		
		System.out.println(speed);
		
		
		//50mile 속도를 넣음
		myCar.setSpeed(50);
		//50mile -> km 변환 값
		speed= myCar.getSpeed();
		System.out.println(speed);
		
		
	}

}
