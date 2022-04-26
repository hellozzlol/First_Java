
public abstract class Human {
	
	
	
	
	//필드
	
		String name;
		double height;
		double weight;
		
		
		//생성자
		public Human() {
			
		}
		
		public Human(String name,double height,double weight) {
			
			this.name = name;
			this.height = height;
			this.weight = weight;
			
			
		}

		//메소드
		public String getName() {
			return name;
		}
		
		public double getHeight() {
			System.out.println("키");
			return height;
		}
		
		public double getWeight() {
			System.out.println("몸무게");
			return weight;
		}	
		
		
		
		
	
		public void getInformation() {
		
			System.out.printf("%s님의 키 %d , 몸무게 %d 입니다.\n", name, height, weight);
			
			
		}
	}