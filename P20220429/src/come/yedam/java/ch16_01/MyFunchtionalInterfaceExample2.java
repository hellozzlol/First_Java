package come.yedam.java.ch16_01;

public class MyFunchtionalInterfaceExample2 {

	public static void main(String[] args) {
		
		//매개변수가 있고 리턴값이 없는 람다식
		MyFunchtionalInterface2 fi;
		
		fi = (a) -> {
			int result = a *5;
			System.out.println(result);
		};
		
		fi.method(5);
		
		fi = (a) -> {System.out.println(a*5);};
		fi.method(4);
		
		fi = a -> System.out.println(a*5);
		fi = method(3);
		

	}

	private static MyFunchtionalInterface2 method(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
