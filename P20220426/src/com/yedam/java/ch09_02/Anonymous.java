package com.yedam.java.ch09_02;

public class Anonymous {
	
	//필드 초기 값으로 대입
	Person field = new Person () {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
		work();
		
		}
		
	}; //다른건{}이게 붙는다는거
	

	//로컬 변수 값으로 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				super.wake();
				walk();
			}
		};//세미콜론 반드시 잇
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
