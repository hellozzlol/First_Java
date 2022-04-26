package com.hello.homework;

public class ArcadeGame implements Keypad{

	//필드
	int mode;
	//생성자
	public ArcadeGame() {

		this.mode = mode;
		mode=NORMAL_MODE;
	}
	
	//메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
		
		
	}

	@Override
	public void leftDownButton() {
		
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
		
		
	}

	@Override
	public void rightUpButton() {
		
		if(NORMAL_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} 
		else if(HARD_MODE == HARD_MODE) {
				System.out.println("캐릭터가 연속 공격");
			}
	
	}

	@Override
	public void rightDownButton() {
		
		if(NORMAL_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		} 
		else if(HARD_MODE == HARD_MODE) {
				System.out.println("캐릭터가 Double HIT 공격.");
			}
		

	}

	@Override
	public void changeMode() {
		
		if(mode == NORMAL_MODE) {
			mode=1;
			System.out.println("현재모드는 HARD_MODE입니다.");
		} 
		else if(mode == HARD_MODE) {
			mode=0;
			System.out.println("현재모드는 MORMAL_MODE입니다.");	
			}
		
		
		
	}

		



		
	
	
	

}