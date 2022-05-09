package com.yedam.prj.gym_Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import com.yedam.prj.dto.TrainerVO;

public class TrainerService {
	
	private TrainerVO Trainer;
	private List<TrainerVO> Trainers = new ArrayList<TrainerVO>();
	//트레이너사번 EX)16-0315 앞번호 16년도 뒷번호는 들어온날짜
	private void dataSet() {
		Trainer = new TrainerVO("16-0315","손현우","남","대구광역시","010-9545-5461",Date.valueOf("1992-12-12"));
		Trainers.add(Trainer);
		Trainer = new TrainerVO("16-0510","박성진","남","대구광역시","010-6595-1245",Date.valueOf("1993-05-07"));
		Trainers.add(Trainer);
		Trainer = new TrainerVO("17-0511","정세운","남","대구광역시","010-9875-1147",Date.valueOf("1997-07-07"));
		Trainers.add(Trainer);
		Trainer = new TrainerVO("18-0512","윤민우","남","대구광역시","010-6548-1268",Date.valueOf("1994-11-01"));
		Trainers.add(Trainer);
		Trainer = new TrainerVO("19-0513","김태현","남","대구광역시","010-1005-1289",Date.valueOf("1990-10-01"));
		Trainers.add(Trainer);
		Trainer = new TrainerVO("20-0514","김원필","남","대구광역시","010-9564-1028",Date.valueOf("1996-01-01"));
		Trainers.add(Trainer);
		
		
		
	}
	
	public void selectList() {
		
		dataSet();
		for(TrainerVO vo : Trainers) {
			vo.toString();
		}
	}
	
	public void selectTrainer(String id) {
		dataSet();
		for(TrainerVO vo : Trainers) {
			if(vo.getId().equals(id)) {
				System.out.println("▶▶▶검색할 직원");
				vo.toString();
				break;
			}
		}
	}
	
	public void insertTrainer(TrainerVO vo) {
		dataSet();
		Trainers.add(vo);
		for(TrainerVO t : Trainers) {
			t.toString();
		}
		
	}
	
}
