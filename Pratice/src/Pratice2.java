import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Pratice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("등록날짜를 입력해주세요");
		LocalDate registerDate = LocalDate.parse(sc.nextLine());
		System.out.println("등록 날짜 : " + registerDate);
		System.out.println("1.3개월 | 2.6개월 | 3.9개월");
		
		int month = Integer.parseInt(sc.nextLine());//int를 문자열로 변환
		if(month ==1) {
			month=3;
		}else if(month ==2) {
			month=6;
		}else if(month ==3) {
			month=9;
		}
		
		LocalDate EndDate = registerDate.plusMonths(month);
		System.out.println("등록기간은 : " + registerDate+" ~ "+EndDate);
		 System.out.println("등록이 완료 되었습니다");

	}

}
