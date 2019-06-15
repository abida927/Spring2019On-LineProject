package repl;

import java.util.ArrayList;

public class Repl180 {

	public static String combineRs(String[] r1,String[] r2) 
	  {
	  
	  ArrayList<String> combine = new ArrayList<>();
	  
	  for(int i = 0; i <r1.length; i++){
	    
	    combine.add(r1[i]);
	  }
	  
	  for(int i = 0; i <r2.length; i++){
	    
	        combine.add(r2[i]);

	  }
	  
	  String newStr = "";
	  for(int i = 0; i < combine.size(); i++){
	    
		  newStr += combine.get(i);
	  
	  }
	   
	  return newStr;
	  }
	public static void main(String[] args) {
//		String[] r1 = {"f","o","o"};
//		String[] r2 = {" b","a","r"};

		                           // how do I call it directly here?
	//	System.out.println(combineRs( {"f","o","o"} , {" b","a","r"}));

		
	}

}
