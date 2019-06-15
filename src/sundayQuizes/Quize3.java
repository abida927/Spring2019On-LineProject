package sundayQuizes;

import java.util.Arrays;


import java.util.Scanner;

public class Quize3 {

public static String[] reverse(String[] arr) {
		
		int counts=arr.length-1;
		for(int i =0; i <counts/2;i++){
		  String temp = arr[0];
		  arr[0]=arr[counts];
		  arr[counts]=temp;
		}
		return arr;
	}

public static String[] reverse1(String[] arr) {
	 String reverse = "";
		
		String[] newarray = reverse.split(" ");
		
		for(int i = arr.length-1; i >= 0; i--)
		{
		    reverse += arr[i];
		 
		    if (i != 0) { reverse += " "; }
		
		
		}
		arr=reverse.split(" ");
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String arr[] = {"apple", "pear","nmn"};
//
//		
//		System.out.println(Arrays.toString(reverse1(arr)));
//		
		
		
		
		
		

		Scanner scan = new Scanner(System.in);
	    String model = scan.next();
	    int year = scan.nextInt();
	    boolean recalled = false;
	    

	    /*
	     * Clunker Motors Inc. is recalling all vehicles in its 
	     * Extravagant line from model years 2010-2012 
	     * as well all vehicles in its Guzzler line from model years 2015-2018. 
	     * A boolean variable named recalled has been declared. 
	     * Given a variable year and a String model write a statement 
	     * that prints true to recalled if the values of year and model match the recall 
	     * details and prints false otherwise.
	     * 
	     * 
	     */
	    
       if((model.equals("Extravagant")&&(year>=2010&&year<=2012) )
    	   ||(model.equals("Guzzler")&&(year>=2015&&year<=2018)) ) {
    	   
    	   System.out.println(!recalled);
       }else
    	   System.out.println(recalled);

    }

}


