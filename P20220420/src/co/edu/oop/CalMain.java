package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {
		Calculator Cal = new Calculator();
		
		Cal.x = 98351;
		Cal.y = 6594211;
		
		Cal.plus(98351 ,6594211);
		Cal.minus(98351 ,6594211);
		Cal.multi(98351 ,6594211);
		Cal.division(98351 ,6594211);
		
		Car car = new Car();//G바겐
		
		
		car.model = "G바겐";
	    car.color = "blue";
	    car.price = 3000000;
	    car.info();
	    System.out.println();
	    
	    
	    
	    Car car2 = new Car();//제네시스
	    car2.model = "제네시스";
	    car2.color = "black";
	    car2.price = 2000000000;
	    car2.info();
	    System.out.println();
	    
	    Car car3 =new Car("제네시스","black",2000000000);
	    car3.info();
	    
	    
	    
	    
	}

}
