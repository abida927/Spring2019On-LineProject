package task_Solutions;

public class ReverseStringWithoutAffectingSpecialCharactors {
	
	 public static String reverseLetters(String word){
			//TODO
			
		     char start='A';
		     char end ='z';		
		     String rev="";
		    for(int i = word.length()-1; i >=0; i--) {
		    	if(word.charAt(i)>=start && word.charAt(i)<='z'){
		    		
		    		rev +=word.charAt(i);
		    		
		    	}
		    	 for(int j=0; j<word.length();j++) {
		 		    	if(!(word.charAt(j)>=start && word.charAt(j)<='z')){
		 		    		rev +=word.charAt(j);
		 		    	}
		 		    }
		    }
		   
		    word = rev;
			return word;
		}

	public static void main(String[] args) {

		String word = "Ab,c,de!$";
		System.out.println(reverseLetters(word));
		
	}

}
