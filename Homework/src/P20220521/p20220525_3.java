package P20220521;

import java.util.Random;
import java.util.Scanner;

public class p20220525_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("## 가위 바위 보 게임 ##");
        System.out.println("( 1.주먹 2.가위  3.보)");
        System.out.print("숫자을 입력하세요 :");
        int com = 0;
        int user = sc.nextInt();
        Random r =new Random();
        
        com = r.nextInt(3+1); 
        
       
        
        switch(com) {
        
        case 1 ://가위
        	if(user == 1) {
        		System.out.println("비김");
        }else if(user ==2) {
        	System.out.println("짐");
        	
        	
        }else if(user ==3) {
        	System.out.println("님 이김");
        }
        break;
        
        
        case 2 : //바위
        	if(user == 1) {
        		System.out.println("짐");
        }else if(user ==2) {
        	System.out.println("비김");
        	
        }else if(user ==3) {
    
        	System.out.println("님 이김");
        }
        	 break;
        //1번 가위 2번 바위 3번 보
        case 3 : //보
        	if(user == 2) {
        		System.out.println("짐");
        		
        }else if(user ==3) {
        	System.out.println("비김");
        	
        }else if(user ==1) {
        	System.out.println("님 이김");
        }
    
        	 break;
        
	}

}
}
