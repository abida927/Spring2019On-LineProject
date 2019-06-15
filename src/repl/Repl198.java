package repl;

import java.util.ArrayList;

public class Repl198 {
	
	public static void repeatAll(ArrayList<Boolean> b){
            
		//one shot.
		//b.addAll(b)
		
		
		int originalSize= b.size();
				 
		for(int i=0; i<originalSize; i++){  
		                     
		    b.add(b.get(i));//cuz ArrayList size is not fixed, so if u do not set original size first , code
		    //will be infinit loop; cuz u add one , size grows by one;
		    
		  }
		  System.out.println(b);
		}

	public static void main(String[] args) {

		ArrayList<Boolean> b= new ArrayList<>();
		b.add(false);
		b.add(true);
		repeatAll(b);
	}

}
