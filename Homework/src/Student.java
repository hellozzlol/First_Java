
public class Student {
	String id ; 
	String name ;
	String korean;
	String math ;
	String english ;
	int score[] = new int[3];
	
	
	public Student(String id, String name, String korean, String math, String english) {
		super();
		this.id = id;
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.english = english;
		
	}
	
	void getInfo() {
		
		System.out.println("===============================================================");
		
		 System.out.println("학번 : " + id);
		 System.out.println("이름 : " + name);
		 System.out.println("국어 : " + korean);
		 System.out.println("수학 : " + math);
		 System.out.println("영어 : " + english);
		 
	  double[] arr= {76,90,100};
	  double sum = 0.0;
	  for(double num : arr) {
		  sum+= num;
	  }
	 
	  double average = sum/arr.length;
	  
	  
	System.out.println("합계 : "+sum);
	System.out.println("===============================================================");
	System.out.println("평균 : " +Math.round(average));
	System.out.println("==============================================================="); 
	
	
	 
	}
}

