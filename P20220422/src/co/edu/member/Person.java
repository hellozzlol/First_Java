package co.edu.member;

public class Person {
	final String nation = "korean";
	final String ssn;
	String name;
	
	public Person(String ssn, String string) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
//메소드
	
	public void info() {
		System.out.println(nation + "," +ssn);
	}

}
