
public class StandardWeightInfo extends Human {
	
	
	
	//생성자
	
		public StandardWeightInfo(String name, double height ,double weight ) {
			
			super(name, height, weight);
		}
		
		
		//메소드
		
		@Override
		
		 public void getInformation() {
			System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " + weight );
			
		}
		
		public double getObesity()  {
			return(height-100)*0.9;
		
	}
		
		

	}


