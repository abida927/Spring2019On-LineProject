package repl;

import java.util.Arrays;

public class Repl197 {

	 public static int[] addElements(int[] ints1, int[] ints2) {
		    
		    int[] addArr=new int[5];
		    for(int i = 0; i<5; i++){
		      addArr[i]=ints1[i]+ints2[i];
		    }
		    return (addArr); //when u return it , u do not need to write Arrays.toString(); but when u call it 
		    //in the main method , u have to use toString method to call it!!
		    }
	public static void main(String[] args) {

		int ar[]= {1,3,5,4,3};
		int arr[]= {1,3,5,4,3};

		System.out.println(Arrays.toString(addElements(ar, arr)));
		
	}

}
