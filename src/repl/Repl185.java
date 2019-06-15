package repl;

public class Repl185 {

	//Chararter.isDigit(ch) 
	//or conditions
	public static String extractNum(String s) {
		String num ="";
	    for(int i =0; i <s.length(); i++){
	       if(s.charAt(i)>='0'&&s.charAt(i)<'9') {
	    	 num +=s.charAt(i)  ;
	       }
	    }
	  return num;
	   
	  }
	
	public static String extractNum1(String s) {
		String extract = "";
	    for(int i =0; i <s.length(); i++){
	    	if(Character.isDigit(s.charAt(i))) {
	    	extract +=s.charAt(i);	
	    	}
	    }

	    return extract;
	}
	public static void main(String[] args) {
		
		String a = "aa!!%$#.10a4a";
		System.out.println(extractNum1(a));
		
		
		
	}

}
