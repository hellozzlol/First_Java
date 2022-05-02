
public class ObesityInfo extends StandardWeightInfo {

	
	
	
	
	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	
	@Override
	
	public void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "몸무게"+ weight);
		
	}
	
	public void getStandWeight() {
		
		System.out.println("표준체중"+(height-100)*0.9);
		
	}


	
			
}


			
		


		
	
	
	


	

