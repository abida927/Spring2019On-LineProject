package day50;

public class Airplane extends Vehicle {
	
	private int wingCount;

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}
	
	public Airplane(String brand, String model, int year,int wingCount) {
		
		super();
		this.wingCount=wingCount;
		
	}

//	@Override
//	public String toString() {
//		return "Airplane [wingCount=" + wingCount + 
	//         ", year=" + year + ", getBrand()=" + getBrand() 
	//          + ", getModel()="+ getModel() + "]";
//	}

	
	public String toString() {
		return "brand is "+getBrand()+" model is "+getModel()+
				" year is "+year+" wingCount is "+wingCount;
	}
	
	
	

	
}
