package co.edu.extend;
//자식클래스
public class Computer extends Calculator{
	
	@Override
	double areaCirecle (double r) {
		System.out.println("자식클래스 areaCircle() 실행");
		return Math.PI * r * r;
	
	
	}


}
