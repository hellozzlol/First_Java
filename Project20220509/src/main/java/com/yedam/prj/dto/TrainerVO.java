package com.yedam.prj.dto;

import java.sql.Date;

public class TrainerVO {
	
	private String id;//트레이너 사번
	private String join;//트레이너 입사년도
	private String name;//트레이너 이름
	private String pt;//트레이너 pt회원수
	private String pay;//트레이너 기본급
	private String bouns;//트레이너 인센티브 
	private String height;//트레이너 키
	private String weight;//트레이너 몸무게
	private String gender;//트레이너원성별
	private String address;//트레이너주소
	private String tel;//트레이너전화번호
	private Date birthday;//트레이너생년월일
	
	public TrainerVO() {
		
	}
	
	public TrainerVO(String id,String join,String name,String pt,
			String pay,String bouns, String height,String weight,String gender,String address,String tel,Date birthday) {
		super();
	
		this.id = id;
		this.join=join;
		this.name =name;
		this.pt = pt;
		this.pay = pay;
		this.bouns = bouns;
		this.height = height;
		this.weight = weight;
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
	
	public String getPt() {
		return pt;
	}
	
	public void setPt(String pt) {
		this.pt = pt;
	}


	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getBouns() {
		return bouns;
	}

	public void setBouns(String bouns) {
		this.bouns = bouns;
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
		System.out.println("직원이름 : "+name+"님" );
		System.out.println("PT담당회원수 : "+pt+"명");
		System.out.println("직원기본급 : "+pay+"만원" );
		System.out.println("인센티브 : "+bouns+"만원" );
		System.out.println("키 : "+height+"cm" );
		System.out.println("체중 : "+weight+"kg" );
		System.out.println("직원성별 : "+gender );
		System.out.println("직원주소 : "+address );
		System.out.println("직원전화번호 : "+tel );
		System.out.println("직원생년월일 : "+birthday );
		System.out.println("===============================");
		
		return address;
	}
	
	
	
	

}
