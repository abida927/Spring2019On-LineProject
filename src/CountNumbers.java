
public class CountNumbers {

	public static void main(String[] args) {

		
		String str = "Cybertck2019Batch10";

		//1#way:
		int count =0;
		
		for(int i =0; i<str.length(); i++) {
			
			if(!(str.charAt(i)>'A' && str.charAt(i)<('z'))) {
				
				count++;
			}
		}
		System.out.println(count);
		
		
		//2# way ==>>replace            //CybertckBatch
        System.out.println(str.length()-str.replaceAll("\\d", "").length());
		//"//d"--->>it takes digits out of string!!!!!!!!!!

		
		
		
	  //3#way :

       str= str.replaceAll("[A-z]", "");

       System.out.println(str.length());
		    
		
	}

}
