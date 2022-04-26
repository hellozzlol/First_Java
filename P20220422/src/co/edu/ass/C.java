package co.edu.ass;

public class C extends A {

	public static void main(String[] args) {
		
		A a = new A();
		int temp;
		//1) public
		temp = a.b;
		
		//protected
		C c = new C();
		int d = c.c;
		
		
		
	}
	

}
