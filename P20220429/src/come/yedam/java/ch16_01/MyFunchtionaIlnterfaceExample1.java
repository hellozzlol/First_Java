package come.yedam.java.ch16_01;

public class MyFunchtionaIlnterfaceExample1 {

	public static void main(String[] args) {
		//매개변수도 리턴값도 존재하지 않는 람다식
		
		MyFunchtionalIterface1 fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		//람다식으로 정의를 내리면 된다!
		
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
			fi.method();
			
			fi = () -> System.out.println("method call3");
			fi.method();
			
		

	

}
}
