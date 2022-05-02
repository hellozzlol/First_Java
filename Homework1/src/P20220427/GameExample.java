package P20220427;

public class GameExample {

	public static void main(String[] args) {
		
		
		
		
		
		//game.leftbo
		
		//전부다 game.leftUpButton
		Keypad rpggame = new RPGgame();
		rpggame.leftUpButton();
		rpggame.rightUpButton();
		rpggame.changeMode();
		rpggame.rightUpButton();
		rpggame.rightDownButton();
		rpggame.leftDownButton();
		rpggame.changeMode();
		rpggame.rightDownButton();
		
		System.out.println("============================================");
		
		rpggame = new ArcadeGame();
		
		rpggame.leftUpButton();
		rpggame.rightUpButton();
		rpggame.leftDownButton();
		rpggame.changeMode();
		rpggame.rightUpButton();
		rpggame.leftUpButton();
		rpggame.rightDownButton();
		
	
	
		
		
		
		
		
		

	}

}
