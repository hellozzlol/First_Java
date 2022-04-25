package homework;

public class Grade extends Main{

	// 부모클래스
	
	
	
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
	this.eng = eng;// this = 인스턴스 //클래스는 하나지만 수많은 인스턴스를 가지고있다.
	this.math = math;
	this.score = score;

}



public Grade(int stdentNo, String studentName) {
	super();
	this.stdentNo = stdentNo;
	this.studentName = studentName;
}
   
 }



