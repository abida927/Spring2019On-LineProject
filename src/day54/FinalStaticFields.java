package day54;

public class FinalStaticFields {

	//public static final field--->CONSTANT, make it all upper case .
	 public static final String RACE= "HUMAN"; 

	//FINAL STATIC FILED VALUE MUST BE INITIALIZED BEFORE CLASS FINISH LOADING!!

	private static final int MAX_SPEED;
	
	public static final int NUM = getStaticNUM();
	
	//All CAP IS HIGHLY RECOMMENDED
	public static final String lowercase ="lower";//will compile, but not recommended
	
	
	static {
		MAX_SPEED=120;
	}
	
	public static int getStaticNUM() {
		return 200;
	}
	
	
	public static void main(String[] args) {

		System.out.println(RACE);
		//RACE ="Humanoid"--->can not do it
		
		System.out.println(MAX_SPEED);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
		
		
	}

}
