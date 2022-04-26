package co.edu.member;

public class Singleton {
	//필드                     //싱글톤 내부에서  인스턴스 해서  클래스에 대한 객체 만들어줌  
	private static Singleton singleton = new Singleton();
    //생성자
	private Singleton() {
		
	}
	//정적 메소드
	static Singleton getInstace( ) {
		if(singleton ==null) {
			singleton =new Singleton();
		}
		
		return singleton;
	}
	

}
