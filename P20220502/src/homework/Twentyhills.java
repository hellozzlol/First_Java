package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Twentyhills {

	private static Scanner iterator;
	private static boolean List;

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String[] ArrayList = {"Orange","Game","Phone","Smart"};
		ArrayList<String> randomList = new ArrayList<String>();
	
		list.add("Orange");
		list.add("Game");
		list.add("Phone");
		list.add("Smart");
		
		int size = list.size();
		
	
	
		while(true){
			System.out.println("============================================");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역| 4.새 게임 | 5.종료");
			System.out.println("============================================");
			
			int random = (int)Math.random()*randomList.size();
			int menu= Integer.parseInt(scn.nextLine());
			
			
			if(menu==1) {
				for(size=0; size<ArrayList.length;size++) {
					
					scn.nextLine();
					System.out.println("===>입력값");
					System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
					
				}
				System.out.println();	
			}
			
			
			
			if(menu==2) {
				for(size=0; size<ArrayList.length;size++) {
					
					scn.nextLine();
					System.out.println("===>입력값");
					System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
					
				}
				System.out.println();	
			}
		
		
		
		
		
		

		
		
		
		
		
	

		
		
	}
}
}

