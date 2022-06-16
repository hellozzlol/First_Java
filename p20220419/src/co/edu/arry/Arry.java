package co.edu.arry;

public class Arry {

	public static void main(String[] args) {
		
	int[] scores = {83, 90, 87};
	
	
	System.out.println("scorse[0]: " + scores[0]);
	System.out.println("scorse[1]: " + scores[1]);
	System.out.println("scorse[2]: " + scores[2]);
	
	int sum = 0;
	for(int i=0; i<scores.length; i++) {
		sum += scores[i];
		
		
	}
	System.out.println("총합 : " + sum);
	double avg = (double) sum / 3;
	System.out.printf("평균 : %.2f \n", avg);
         
	//최대, 최소값구하기
	int[] ary2 = {5,3,2,8,1};
	int max = 0;
	int min = ary2[0];
	for(int i =0; i<ary2.length; i++) {
		//최대값 
		if(max < ary2[i]) {
			max = ary2[i];
		}
		
		//최소값
		if(min > ary2[i]) {
			min = ary2[i];
			
		}
	}
	System.out.println("최대값" +max);
	System.out.println("최소값" +min);
	//내림차순 5->4->3->2->1
	
	
	//데이터를 비교해서 값 바꾸기
	
	
       
	}

}
