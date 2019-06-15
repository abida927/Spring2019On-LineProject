package replClass;

import java.util.Arrays;

public class TableGenerator {

	
	
	public static void main(String[] args) {
		TableGenerator t= new TableGenerator();
		System.out.println(Arrays.toString(t.generateTable(3, 6)));
	}
	
	 public int[] generateTable(int value, int numberOfEntries) {

		 int[] arr= new int[numberOfEntries];
         for(int i =0; i < numberOfEntries; i++) {
        	 
        	 arr[i]=i+value;
        	 ;
         }
	        
	        
	     return arr;   
	    }

}
