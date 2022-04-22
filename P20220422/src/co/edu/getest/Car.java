package co.edu.getest;

public class Car {
	//필드

	public String company;
	public String model;
	public String color;
	public int speed;
	
	//생성자

	//메소드

	public String getCompany() {
		return company;
	}
//get에서 set으로 넘어가줌
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		//속도 mile (미국 단위) -> km
		return speed*2;
	}

	public void setSpeed(int speed) {
		if(speed <0) {
			speed = 0;
		}
		this.speed = speed;
	}
	
	
	}


