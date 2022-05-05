import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		double c,f;
		
		Scanner input = new Scanner(System.in);
		
		int C;
		int F ;
		
		System.out.println("화씨 온도를 입력하시오");
		
		F = input.nextInt();
		C = (F - 32) * 5/ 9;
		
		System.out.println(C);

	}

}
