package task_Solutions;

public class StringBuilder_Class {

	public static void main(String[] args) {

		/*
		 StringBuilder: mutable version of sequences of characters.
		 String: immutable version of sequences of characters.
		 
		 */
		
		String str = "cybertek";
		 	str.concat(" School");
		System.out.println(str);
		
		// StringBuilder strb="cybertek";
		 	
		StringBuilder strb= new StringBuilder("Cybertek");
				strb.append(" school");  // Cybertek school
		
				
			strb.reverse();//StringBuilder can directly reverse String
			System.out.println(strb);
			
			
			String str2="Batch11";
			
			// convert string to stringbuilder:
			
			StringBuilder strb2 = new StringBuilder(str2).reverse();
			System.out.println(strb2);
			
			// Convert StringbUilder to String:
			
			String str3 =	strb2.toString();
			System.out.println(str3);
		
	}

}
