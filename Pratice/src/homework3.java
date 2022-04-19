import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		
		int grade;
		
		Scanner sc = new Scanner(System.in);
	
			System.out.println("성적을 입력하세요.");
			
			int score = sc.nextInt();
			if(score <0 || score > 100)
			
			{}
				else {
		            
			        switch (score/10) {
			        
			  
			       
			            case 9 : System.out.println("A"); break;
			        
			            case 8 : System.out.println("B"); break;
			        
			            case 7 : System.out.println("C"); break;
			        
			            default: System.out.println("F");
			            }
			        }
			    }
			}


			
		

		


	