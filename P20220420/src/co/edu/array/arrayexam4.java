package co.edu.array;

public class arrayexam4 {
	public static void main(String[] args) {
		
		int[][] ary = {{1,2},{2,3},{3,4},{4,5},{5,6}};
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.println(ary[i][j] + " ");
			}
			System.out.println();
		}
		
		//2차원 배열 -> 배열 안에 배열이 존재.
		int[][] ary1 = new int[5][5];
		
		
		int num =1;
		
		//2차원 배열 데이터 입력 1~25
		
		for(int i =0; i<ary1.length; i++) {
			for(int j=0; j<ary1[i].length; j++) {
				ary1[i][j] += num;
				num++;
			}
		}
		//2차원 배열 데이터 출력
		for(int i =0; i<ary1.length; i++) {
			//length 는 동그라미 갯수
			for(int j=0; j<ary1[i].length; j++) {
				System.out.print(ary1[i][j] + " ");
			}
				System.out.println();
				
				System.out.println("   ");
				
				for(int i1 =0; i1<ary1.length; i1++) {
					//length 는 동그라미 갯수
					for(int j=0; j<ary1[i1].length; j++) {
						System.out.print(ary1[j][i1] + " ");
					}
						System.out.println();
				
				
				
				
		}
	}
}
}
		
