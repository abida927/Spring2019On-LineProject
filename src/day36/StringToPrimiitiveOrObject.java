package day36;

public class StringToPrimiitiveOrObject {

	public static void main(String[] args) {

		//from String to primitive
		//parseX method will take String and 
		//return --->primitive value;
		
		String str1 = "True";
		Boolean b1=Boolean.parseBoolean(str1);
		Boolean b2=Boolean.parseBoolean("ABC");
		Boolean b3=Boolean.parseBoolean("TRUE");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//From String to Wrapper Class Object
		//valueOf method will take String
		//and return -->Wrapper Class object
		
		String d = "3.14";
		Double d1 = Double.valueOf(d);
		System.out.println(d1.toString());
		
		double d2 = d1 ; //--->> auto unboxing
		
		//invalid conversion
		//System.out.println(Double.parseDouble("3.14abc"));
		//System.out.println(Integer.);
		// primitive type variable can not be set to null 
				//int i = null ; 
				
			
		// any reference type (everything that not primitive)
				// can be set to null 
				Integer i1 = null ; 
				Double d6 = null ; 
				
				// invalid conversion 
				//System.out.println(  Double.parseDouble("3.14abc") );	
				//System.out.println(  Integer.valueOf("3.14") );

	}

}
