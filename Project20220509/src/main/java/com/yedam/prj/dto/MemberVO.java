package com.yedam.prj.dto;

import java.util.Date;

public class MemberVO {
	
	private String id;//회원번호
	private String name;//회원이름
	private String gender;//회원성별
	private String height;//회원 키
	private String weight;//회원 몸무게
	private String address;//회원주소
	private String tel;//회원전화번호
	private Date birthday;//회원생년월일

	
	
	
	
	public MemberVO() {
		
	}
	
	public MemberVO(String id,String name,String gender,String height,String weight,String address,String tel,Date birthday) {
	super();
	
	this.id = id;
	this.name =name;
	this.gender = gender;
	this.height = height;
	this.weight = weight;
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
	
	
	

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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
		System.out.println("==========================");
		System.out.println("회원번호 : " +id );
		System.out.println("회원이름 : " +name );
		System.out.println("회원성별 : " +gender );
		System.out.println("회원 키 : " +height );
		System.out.println("회원 몸무게 : " +weight );
		System.out.println("회원주소 : " +address );
		System.out.println("회원전화번호 : " +tel );
		System.out.println("회원생년월일 : " +birthday );
		System.out.println("==========================");
		return address;
	}

	
	

}
