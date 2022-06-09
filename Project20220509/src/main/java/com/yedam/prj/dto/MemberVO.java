package com.yedam.prj.dto;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MemberVO {
	
	private String id;//회원번호
	private String name;//회원이름
	private String gender;//회원성별
	private String height;//회원 키
	private String weight;//회원 몸무게
	private String address;//회원주소
	private String tel;//회원전화번호
	private Date birthday;//회원생년월일
	private Date period;//회원등록날짜
	private Date endDate;//회원등록날짜
	public MemberVO() {
		
	}
	
	public MemberVO(String id,String name,String gender,String height,
			String weight,String address,String tel,Date birthday,Date period,Date endDate) {
	super();
	
	this.id = id;
	this.name =name;
	this.gender = gender;
	this.height = height;
	this.weight = weight;
	this.address = address;
	this.tel = tel;
	this.birthday=birthday;
	this.period = period;
	this.endDate = endDate;
	

	
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

	
	
	public Date getPeriod() {
		return period;
	}
	
	
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
		Scanner sc = new Scanner(System.in);
		System.out.println("등록날짜를 입력해주세요");
		LocalDate period = LocalDate.parse(sc.nextLine());
		System.out.println("등록 날짜 : " + period);
		System.out.println("1.3개월 | 2.6개월 | 3.9개월");
		
		int month = Integer.parseInt(sc.nextLine());//int를 문자열로 변환
		if(month ==1) {
			month=3;
		}else if(month ==2) {
			month=6;
		}else if(month ==3) {
			month=9;
		}
		
		LocalDate endDate1 = period.plusMonths(month);
		System.out.println("등록기간은 : " + period+" ~ "+endDate);
		 System.out.println("등록이 완료 되었습니다");

	}

	@Override
	public String toString() {
		System.out.println("==========================");
		System.out.println("회원번호 : " +id );
		System.out.println("회원이름 : " +name );
		System.out.println("회원성별 : " +gender );
		System.out.println("회원 키 : " +height +"cm");
		System.out.println("회원 몸무게 : " +weight +"kg" );
		System.out.println("회원주소 : " +address );
		System.out.println("회원전화번호 : " +tel );
		System.out.println("회원생년월일 : " +birthday );
		System.out.println("회원등록기간 : " + period+" ~ "+endDate);
		System.out.println("==========================");
		return address;
	}
	
	
	

	

	
	

}
