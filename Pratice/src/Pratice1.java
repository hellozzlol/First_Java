import java.time.LocalDate;
import java.util.Scanner;

public class Pratice1 {



	public static void main(String[] args) {
		
		
		//int month = 2022-08-14;
		
		Scanner sc = new Scanner(System.in);
		LocalDate newDate = LocalDate.parse("2022-05-14");//변수 1.등록날짜 
		
		System.out.println("등록날짜를입력해주세요");
		sc.nextLine();
		System.out.println("등록개월수를 입력해주세요");
	
		System.out.println("1.3개월2.6개월.3.9개월");
		sc.nextLine();
		
		int date = Integer.parseInt(sc.nextLine());
		
		if(newDate==plusMoths(1)) {
			date = 3;
			
		}else if(newDate==plusMoths(2)) {
			date = 6;
		}else if(newDate==plusMoths(3)) {
			date = 9;
		}
		
		
		
		
		System.out.println("등록기간은" +newDate);
		LocalDate newDate1=newDate.plusMonths(3);
		System.out.println("등록기간 : "+newDate+" ~ "+newDate1);
		LocalDate newDate2=newDate.plusMonths(6);
		System.out.println("등록기간 : "+newDate+" ~ "+newDate2);
		LocalDate newDate3=newDate.plusMonths(9);
		System.out.println("등록기간 : "+newDate+" ~ "+newDate3);
		
		
		
		
		
	
	}

	private static LocalDate plusMoths(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
