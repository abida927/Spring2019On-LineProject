package day38;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums= new ArrayList<>();

		int sum = 0;
		int average = 0;
		for (int i = 1; i <= 100; i++) {
			nums.add(i);		
		}
		
		System.out.println(nums);
		
		   /*
		     * TASK 1 : 
		     * Create an ArrayList of integer from 1-100
		     
		     * get the sum of the each items 
		     * get the average
		     * 
		     * Create another list that contain items from 100- 1 
		     * get the count of numbers divisible by 3 and 5 
		     * 
		     * OPTIONAL 
		     * Combine above 2 lists -- add everything from 2nd list to first one
		     * 
		     * Update every odd items to 0 ; 
		     * 
		     * */
//		    ArrayList<Integer> lst = new ArrayList<>();
//		    // adding 1-100 to the list 
//		    for(int i=1; i<=100; i++) {
//		      lst.add(i);
//		    }
//		    System.out.println(  lst  );
//		    
//		    
//		    int sum = 0;
//		    for (int i = 0; i < lst.size(); i++)
//		    {
//		      sum+= lst.get(i);
//		    }
//		    int average = sum/ lst.size(); 
//		    System.out.println( "the average is : " + average);

	}

}
