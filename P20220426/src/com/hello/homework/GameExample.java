package com.hello.homework;

public class GameExample {

	public static void main(String[] args) {
		
		RPGgame rpggame = new RPGgame();
		
		//game.leftbo
		
		//전부다 game.leftUpButton
	
		System.out.println("RPGgame 실행");
	
		rpggame.leftUpButton();
		rpggame.rightUpButton();
		rpggame.changeMode();
	System.out.println("캐릭터가 두칸단위로 점프한다.");
	System.out.println("캐릭터가 HIT 공격");
		rpggame.rightDownButton();
		rpggame.changeMode();
		rpggame.rightDownButton();
		rpggame.rightDownButton();
		rpggame.rightDownButton();
		System.out.println("캐릭터가 일반공격.");
	
		
		System.out.println("============================");
		
		System.out.println("ArcadeGame 실행");
		
		
		rpggame.leftUpButton();
		rpggame.leftDownButton();
		rpggame.rightUpButton();
		rpggame.rightDownButton();
		rpggame.changeMode();
		rpggame.leftUpButton();
		rpggame.leftDownButton();
		rpggame.rightUpButton();
		rpggame.changeMode();
		
		
		
		
		
		

	}

}
