package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class WarmUP {

	public static void main(String[] args) {

//		Task 1 
//		Create an ArrayList object and add 5 whole numbers
//		try out adding one by one 
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7));
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(140);
		num.add(50);

        //and also try adding in one shot 
		//first way to create in one shot!
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 6, 7));
	
		//2# way to create in one shot!
		//Collections.addAll(nums, 1,2,3,4,5);

		System.out.println(nums);
		
//		update each number to doule of that number  1,3,5,6,7 --> 2 6 10 12 14

		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		System.out.println(nums);
		
		
	
	    // reverse this ArrayList using one of the utility method that we learned from Collections class

		//1# using List method to reverse;
		Collections.reverse(nums);
		System.out.println(nums);
		
		//2# reversing by creating new object, adding item from backwords
		ArrayList<Integer> numRev=new ArrayList<>();
		
		for(int i = nums.size()-1; i>=0; i--) {
			
			numRev.add(nums.get(i)); 
		}

		System.out.println(numRev);	
		
		//3# reverse without creating new object; using temp variable to swap each value
		for(int i =0; i <=nums.size()/2; i++) {
			Integer temp=nums.get(i);
			nums.set(i, nums.get(nums.size()-1-i));
			nums.set(nums.size()-1-i, temp);
		}

		System.out.println(nums);
		
		/*
		 * 
		ArrayList<Integer> nums=new ArrayList<>();
		Random ran=new Random();
		for(int i=0; i<5; i++)
	    nums.add(ran.nextInt());		
		System.out.println(nums);
		 */
		
		ArrayList<Integer> numsRam=new ArrayList<>();
		Random ram = new Random();
		numsRam.add(ram.nextInt(100));
		numsRam.add(ram.nextInt(100));
		numsRam.add(ram.nextInt(100));
		numsRam.add(ram.nextInt(100));
        System.out.println(numsRam);
	}

}
