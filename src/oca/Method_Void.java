package oca;

import java.util.Arrays;

public class Method_Void {

	/*
	 return type:
	  		void:  method doesnt return any value, and the method is for executing 
	  					the body only with out returning any data. 
	 */
	
	public void method1() {
	//	return;   // usually we dont use it, becasue void doesnt allow return any value
		System.out.println("How are you");
		method2();
	}
	
	public static void method2() {
		// method1();   static only accepts static.
		System.out.println("Hello");
	}
	public static void method3() {
		System.out.println("Batch11");
		method2();
	}
	
	public static void main(String[] args) {
		method3();
		
	//	RevStr();  if method signature contains parameter, argument must be provided
		
		RevStr("Cybertek");
		
		LargestSmallest(new int[] {1,2,3,4,5,600,7,8,9});
		System.out.println(".......................");

		Largest(new int[] {10,2,3,4876,5,600,7,-888,9});
		System.out.println("----------------------------------");

		LargestSmallest2(new int[] {-1,2,3,4876,5,600,7,-888,9});

		
	}
	// create method that can reverse any given string:
	
	public static void RevStr ( String str ) {
		String result="";
		
		for(int i=str.length()-1; i >= 0 ; i--) {
			result = result+ str.charAt(i);
		}
		System.out.println(result);
	}
	
	
	// create method that returns the largest and smallest numbers from the array
	public static void LargestSmallest (int[] arr) {
				Arrays.sort(arr);
			System.out.println("Largest value is: "+arr[arr.length-1] + "\nSmallest number is: "+arr[0]);
		
	}
	
	
	public static void Largest(int[] arr) {
		//int max=-9999999;
		int max=arr[0];
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void LargestSmallest2(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}

}
