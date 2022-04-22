package homework;

public class F {

	//F 부모클래스
	
	
	
   int stdentNo; //학번
   String studentName; //학생이름
   int kor;
   int eng;
   int math;
   int score[] = new int[3];
   
   
   
public F(int stdentNo, String studentName, int kor, int eng, int math, int[] score) {
	super();
	this.stdentNo = stdentNo;
	this.studentName = studentName;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.score = score;

}



public F(int stdentNo, String studentName) {
	super();
	this.stdentNo = stdentNo;
	this.studentName = studentName;
}
   
 }



