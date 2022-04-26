package com.hello.homework;

public  class RPGgame implements Keypad {
	
	//필드 초기 값으로 대입
	
	int mode;
	
	//생성자
	public RPGgame() {

		this.mode = mode;
		mode=NORMAL_MODE;
	}
	
	//메소드
	@Override
	public  void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
		
	}



	@Override
	public void rightUpButton() {

		
		if(NORMAL_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} 
		else if( HARD_MODE == HARD_MODE) {
				System.out.println("캐릭터가 두칸단위로 점프한다.");
			}
		
		
	}
	
	@Override
	public void rightDownButton() {
		
		
		
		if(NORMAL_MODE == HARD_MODE ) {
			System.out.println("캐릭터가 HIT 공격.");
		} 
		else if(HARD_MODE == NORMAL_MODE) {
				System.out.println("캐릭터가 일반 공격.");
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
			System.out.println("현재모드는 NORMAL_MODE입니다.");	
			}
			
		}

	}
	
		
		
	
	
	
	