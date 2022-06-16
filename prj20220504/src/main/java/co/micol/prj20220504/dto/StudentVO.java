package co.micol.prj20220504.dto;

import java.util.Date;

public class StudentVO {
	private String id; //학번
	private String name; //이름
	private String major;//전공
	private String address;//주소
	private String tel;//전화번호
	private Date birthday;
	
	public StudentVO() {
		
	}
	
	
	
	

	public StudentVO(String id, String name, String major, String address, String tel, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.address = address;
		this.tel = tel;
		this.birthday = birthday;
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
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

	public Date getbirthday() {
		return birthday;
	}

	public void setbirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	
	@Override
	public String toString() {
	 System.out.print(id + " : ");
	 System.out.print(name + " : ");
	 System.out.print(major + " : ");
	 System.out.print(address + " : ");
	 System.out.print(tel + " : ");
	 System.out.println(birthday);
	 
	return address;
	 
	 
	 
	 
	 
	 
	}





	
	
	

}
