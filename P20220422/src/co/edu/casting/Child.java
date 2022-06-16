package co.edu.casting;

public class Child extends Parent {
@Override
void methoo2() {
	super.methoo1();
	System.out.println("child - method2");
}


void methoo3() {
	System.out.println("child - method3");
}
}
