package com.yedam.prj.dto;

import java.sql.Date;

public class TrainerVO {
	
	private String id;//트레이너 사번
	private String join;//트레이너 입사년도
	private String name;//트레이너원이름
	private String gender;//트레이너원성별
	private String address;//트레이너주소
	private String tel;//트레이너전화번호
	private Date birthday;//트레이너생년월일
	
	public TrainerVO() {
		
	}
	
	public TrainerVO(String id,String join,String name,String gender,String address,String tel,Date birthday) {
	super();
	
	this.id = id;
	this.join=join;
	this.name =name;
	this.gender = gender;
	this.address = address;
	this.tel = tel;
	this.birthday=birthday;
	
	
	
	}


		
		
	



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	public String getJoin() {
		return join;
	}

	public void setJoin(String join) {
		this.join = join;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getBirthday() {
		return birthday;
	}
	
	public void setbirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		System.out.println("===============================");
		System.out.println("사 번 : "+id );
		System.out.println("입사년도 :" +join);
		System.out.println("직원이름 : "+name );
		System.out.println("직원성별 : "+gender );
		System.out.println("직원주소 : "+address );
		System.out.println("직원전화번호 : "+tel );
		System.out.println("직원생년월일 : "+birthday );
		System.out.println("===============================");
		
		return address;
	}
	
	
	
	

}
