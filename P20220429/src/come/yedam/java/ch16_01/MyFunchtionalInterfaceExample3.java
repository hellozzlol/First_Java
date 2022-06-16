package come.yedam.java.ch16_01;

public class MyFunchtionalInterfaceExample3 {

	public static void main(String[] args) {
		
		//두개의 매개변수가 있고 리턴 값이ㅣ 있는 람다 식
		MyFunchtionalInterface3 fi;
		
		fi = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));//출력 값7
		
		fi = (x,y) -> {return x+y;};
		System.out.println(fi.method(4, 7));//출력 값11
		
		fi = (x,y) -> x+y;//이렇게도 가넝
		System.out.println(fi.method(10, 20));//출력 값30
		
		fi = (x,y) -> Math.subtractExact(x, y);//sub어쩌고는 -라서 10-20=-10나옴ㅋㅋ
		System.out.println(fi.method(10, 20));
		
		//익명객체라고 생각할수있지만 걘 한번밖에 못하고 람다식은 자바에서 제공되는 메소드라 여러번 사용 가능

	}

}
