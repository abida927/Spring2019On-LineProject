package day38;

import java.util.*;


public class OneShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(3,5,6,7,5,4,3); 	
		//lst.add(100) ;   // does not work 
		//lst.remove(0); 	// does not work 
		//lst.set(0, 100); //  work 
		System.out.println(  lst );

		List<String> str = Arrays.asList("Superman","Batman","Wonder Woman"); //it's a list , not ArrayList;
		
		//we can sign it to ArrayList to modified;
		
		ArrayList<String> strCool = new ArrayList<>(str);
		
		ArrayList<String> strCool1 = new ArrayList<>(Arrays.asList("Superman","Batman","Wonder Woman","bbbb"));

		System.out.println(strCool);
		System.out.println(strCool1);
	}

}
