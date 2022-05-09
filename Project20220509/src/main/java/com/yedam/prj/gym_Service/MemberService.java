package com.yedam.prj.gym_Service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.yedam.prj.dto.MemberVO;
import com.yedam.prj.dto.TrainerVO;

public class MemberService {
	
	private MemberVO Member;
	private List<MemberVO> Members = new ArrayList<MemberVO>();
	
	private void dataSet() {
		
		//회원번호는 5-0509 앞번호는 월-뒷번호05는 가입순서 뒷번호 09는 날짜
		Member = new MemberVO("05-0509","김미나","여","대구광역시","010-1234-5679",Date.valueOf("2000-01-01"));
		Members.add(Member);
		Member = new MemberVO("05-0510","김소연","여","대구광역시","010-6595-5689",Date.valueOf("1995-12-01"));
		Members.add(Member);
		Member = new MemberVO("05-0511","김하늘","여","대구광역시","010-9585-5659",Date.valueOf("1997-05-07"));
		Members.add(Member);
		Member = new MemberVO("05-0512","박하진","여","대구광역시","010-4854-9375",Date.valueOf("1994-06-01"));
		Members.add(Member);
		Member = new MemberVO("05-0513","최민진","여","대구광역시","010-6585-4785",Date.valueOf("1990-08-01"));
		Members.add(Member);
		Member = new MemberVO("05-0514","이채연","여","대구광역시","010-9512-6511",Date.valueOf("1996-07-01"));
		Members.add(Member);
		
	
	}
	
	public void selectList() {
		dataSet();
		for(MemberVO vo : Members) {
			vo.toString();
		}
	}
	
	
	public void selectMember(String id) {//회원 검색하는 부분
		dataSet();
		for(MemberVO vo : Members) {
			if(vo.getId().equals(id)) {
				System.out.println("▶▶▶검색할 회원");
				vo.toString();
				break;
			}
		}
	}
	
	
	public void insertMember(MemberVO vo) {
		dataSet();
		Members.add(vo);
		for(MemberVO m : Members) {
			m.toString();
		}
	}

	

}
