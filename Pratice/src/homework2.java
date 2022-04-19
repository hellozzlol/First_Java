import java.util.Random;

public class homework2 {

	public static void main(String[] args) {
		
		int user;

		int com;



		Random r = new Random();

		com = (r.nextInt() >>>1) % 3 ;



		System.out.print("가위[0], 바위[1], 보[2]를 선택하시오==>");

		user = r.nextInt();



		if(user == com)

			System.out.println("비김.");

		else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com ==1))

		

			System.out.println("승리.");

		else 

			System.out.println("패배.");



		
		
		
	}

}
