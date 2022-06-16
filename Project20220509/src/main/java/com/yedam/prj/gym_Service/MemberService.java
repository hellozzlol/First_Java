package com.yedam.prj.gym_Service;



import java.util.List;
import java.util.Scanner;

import com.yedam.prj.dto.MemberVO;



public class MemberService {
	private List<MemberVO> members;
	private Scanner sc;
	
	public MemberService(List<MemberVO> vo) {
		this.members = vo;
	}

	public void selectList() {//전체 회원을 보여주는 부분
		
		for(MemberVO vo : members) {
			vo.toString();
		}
	}
	
	
	public void selectMember(String id) {//회원 검색하는 부분
		
		for(MemberVO vo : members) {
			if(vo.getName().equals(id)) {
				System.out.println("▶▶▶검색할 회원↓");
				vo.toString();
				break;
			}
		}
		
	}
	
	
	public void insertMember(MemberVO vo) {//회원등록하는부분
	    members.add(vo);
		for(MemberVO m : members) {
			m.toString();
		}
	}
	
	
	public void memberModify(String name) {//전화번호수정하는 부분
		
	
		//회원의 전화번호만 수정
		//콘솔창에 어떤식으로 띄우고 싶냐면
		//4번 회원수정을 누르면
		//수정할 회원의 이름을 입력 라는 문구가 출력
		//이름을 입력하면
		//김미나 회원님의 전화번호를 변경하시겠습니까? 라고 문구가 출력되고
		//변경할 전화번호를 입력해주세요 라고 문구가 출력되면
		//변경할 전화번호를 입력한다
		//그다음엔 변경되었습니다 라는 문구가 나온다.
		//위에 처럼 하고 싶은데 아직 내 머리가...정리..가..안되네ㅐ요ㅠ
		  //성공 완(2022-05-11). 
		Scanner lsc = new Scanner(System.in);
		//회원정보 수정하는 부분↓
		for(MemberVO vo : members) {
			if(vo.getName().equals(name)) {
				vo.toString();
				System.out.println("변경할 전화번호 입력");
				vo.setTel(lsc.nextLine());
				vo.toString();
				System.out.println("변경할 체중 입력");
				vo.setWeight(lsc.nextLine());
		     	vo.toString();
				
	 	  }
		 }	
		}	
	
	public void memberDel(String name) {  
		//회원정보 삭제하는 부분
		for(MemberVO vo : members) {
				if(vo.getName().equals(name)) {
					members.remove(vo);
					break;
				}
		}

	}
	
	
	
	
	
	
	

}

	