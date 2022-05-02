package P20220427;

public class Lotto {

	public static void main(String[] args) {
		
		//참고로 제가 만들고 싶은 방식은
		//"행운의로또번호는?(숫자,숫자,숫자,숫자,숫자,숫자)입니다
		System.out.println("=============부자되세여====================");
		int lotto[]=new int[6]; //로또라는 변수를 주고 배열!!! 로또 숫자는 6자리니까 6칸?이들어갈수있게 방을 만들어줌
		System.out.println("행운의 로또번호는?");//출력은 행운의 로또 번호는?
		System.out.println("=============================================");
		for(int i = 0; i < lotto.length; i++) {//legth를쓰는 이유는 배열의 길이를 알고싶을때 사용된다. 
			int num = (int) (Math.random()*45)+1; //for,if문 과 math.random으로 돌린다.
			lotto[i] = num; //사실 이부분이 잘 모르겠는데 num값은 랜덤으로 돌아가니까 그냥 num 값을 준걸까?
			for(int z = 0; z < i; z++) { //z인 이유는 int 값은 내가 그냥 정하면 되는거니까용!
				if(lotto[i]==lotto[z]) {
					i--;
							
				}
			}
			System.out.print(lotto[i] + "  "); //로또번호를 출력 print인이유는 숫자가 나오기때문임 
		
			
		}
		
		
	
		

	}
	

	
}