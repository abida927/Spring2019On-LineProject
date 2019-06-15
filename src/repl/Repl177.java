package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl177 {

	
	 public static int[] mergR(int[] a,int[] b) {
		    

		 int[] merg = new int [a.length+b.length];
		    
		    for(int i = 0; i <a.length; i++){
		      merg[i]+=a[i];
		    }
		   
		   for(int j = 0; j<b.length; j++){
		     merg[a.length+j]+=b[j];
		   }
		    
		    return merg;

		 
		   
		    
		  }//end mergR
		  
	public static void main(String[] args) {

		int[] a = {1,2};
		int[] b = {3,4};
		System.out.println(Arrays.toString(mergR(a,b)));
	}

}
