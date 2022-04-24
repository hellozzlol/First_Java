

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
	
		

		
		Scanner sc= new Scanner(System.in);
		
		
		
	
		
		
		System.out.println("===================================================================================");
		
		System.out.println("1.이름  2. 학번 3.국어 4. 수학  5.영어 6. 합계 7.평균 8.종료");

		System.out.println("===================================================================================");
	
		sc.nextLine();
		System.out.println("1.이름");
		
		sc.nextLine();
		System.out.println("====>입력");
		
		sc.nextLine();
		System.out.println("2.학번");
		
		sc.nextLine();
	
			
		System.out.println("====>점수입력");
		
		int count1 = sc.nextInt();
	    System.out.println("3. 국어" + count1);
		
	    int count2 = sc.nextInt();
		System.out.println("4. 수학"+ count2 );

		int count3 = sc.nextInt();
		System.out.println("5. 영어"+ count3);
		
		
		

		
	    int sum = count1+count2+count3;
		double avg = (double)sum/3;
		
		
		sc.nextInt();
		 System.out.println("6.합계 : " +sum);
	
		 
		 
		 sc.nextInt();
		 System.out.println("7.평균 : " +avg);
	
		 
	
		sc.nextLine();
		System.out.println("8.종료" );
		

		System.out.println("===================================================================================");
	
	}

}
