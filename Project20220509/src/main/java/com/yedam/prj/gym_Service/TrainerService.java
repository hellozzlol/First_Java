package com.yedam.prj.gym_Service;

import java.util.List;
import java.util.Scanner;

import com.yedam.prj.dto.TrainerVO;

public class TrainerService {
	private List<TrainerVO> trainers;
	
	public TrainerService(List<TrainerVO> vo) {
		this.trainers = vo;
	
	}
		
	public void selectList() {//전체 직원목록을 보여주는 부분
		for(TrainerVO vo : trainers) {
			vo.toString();
		}
	}
	
	public void selectTrainer(String id) {//직원 검색부분
		
		for(TrainerVO vo : trainers) {
			if(vo.getName().equals(id)) {
				System.out.println("▶▶▶검색할 직원");
				vo.toString();
				break;
			}
		}
	}
	
	
	public void insertTrainer(TrainerVO vo) {//직원등록하는부분
		trainers.add(vo);
		for(TrainerVO t : trainers) {
			t.toString();
		}
		
	}
	
	public void trainerModify(String name) {   
		//직원 전화번호,기본급,pt회원수 수정하는 부분
		
		Scanner lsc = new Scanner(System.in);
			for(TrainerVO vo : trainers) {
				//회원정보 수정하는 부분
				if(vo.getName().equals(name)) {
					vo.toString();	//   변경할직원의 이름을 가져오는 메소드
					System.out.println("변경할 전화번호 입력");			
					vo.setTel(lsc.nextLine());//set만 씀..!! 
					vo.toString();//변경된 목록이 보이는 메소드.
					System.out.println("변경할 PT회원수 입력");
					vo.setPt(lsc.nextLine());
					System.out.println("변경할 기본급 입력");
					vo.setPay(lsc.nextLine());
					System.out.println("변경할 인센티브금액 입력");
					vo.setBouns(lsc.nextLine());
					vo.toString();
					break;
				}
			}
				
		
		}
	public void trainerDel(String name) {
		//트레이너 삭제하는 부분 
		
		for(TrainerVO vo : trainers) {
			if(vo.getName().equals(name)) {
				trainers.remove(vo);
				break;
			}
		}
		
	}
		
		
	}
	
	
	