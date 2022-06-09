package P20220529;

import java.util.Arrays;
import java.util.Scanner;

public class p20220529 {

	public static void main(String[] args) {
      int[] arr1  = {10,20,30,50,3,60,-3};
      
            //문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
      
             System.out.println("1번문제"+arr1[5]);
      
      
		
    		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
             int[] arr11  = {10,20,30,50,3,60,-3};
        for(int i=0; i<arr11.length; i++) {
        	if(i==3) {
        		continue;
        	}
        	System.out.println("2번문제 arr["+i+"]:" +arr11[i]);
        	
        }
             
    		
    		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
      		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
            arr1 = new int[] {10,20,30,1000,3,60,-3};
            System.out.println("3번문제"+arr1[3]);
            
    		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
            //int max =0;
          //  arr1  = new int[] {10,20,30,1000,3,60,-3};
            
            //for(int i =0; i>1000; i++) {
            	//System.out.println("최대값 : "+max);
            //}
            
            Arrays.sort(arr1);
           
            System.out.println("4번문제 최대값 : " + arr1[arr1.length-1]);
            System.out.println("      최소값 : " + arr1[0]);
            
    		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
            int[] arr2  = {10,65,75,84,12,45,95,35,87,75};
          

        	for (int i = 0; i < arr2.length; i++) {
        	}

        	//3의 배수만 출력
        	int a = 0;
        	for(int i=0;i<arr2.length;i++){
        		if(arr2[i]%3 == 0){
        			System.out.println("5번 문제 3의 배수 :"+" "+arr2[i]);
        		}else{
        			a++;
        			if(a ==10){
        				
        			}
        		}
        	}

        }
           

	


            
	}


