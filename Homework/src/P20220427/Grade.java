package P20220427;
import java.io.InputStream;
import java.util.Scanner;

public class Grade   extends GradeMain {

	   int stdentNo; //학번
	   String studentName; //학생이름
	   int kor;
	   int eng;
	   int math;
	   int score[] = new int[3];
	   
	   
	   
	public Grade(int stdentNo, String studentName, int kor, int eng, int math, int[] score) {
		super();
		this.stdentNo = stdentNo;
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.score = score;
	}




	  
	   
	
}

