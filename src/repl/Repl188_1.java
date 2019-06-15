package repl;

import java.util.ArrayList;

public class Repl188_1 {

	
	public static void timesTwo(ArrayList<Integer> nums){
		  
		  ArrayList<Integer> multiplyBy2= new ArrayList<>();
		  
		  for(int i = 0; i<nums.size(); i++){
		    multiplyBy2.add(i, nums.get(i)*2);
		  }
		  System.out.println(multiplyBy2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<Integer> nums= new ArrayList<>();

		  nums.add(3);
		  nums.add(4);
		  
		  timesTwo(nums );
		  
	}

}
