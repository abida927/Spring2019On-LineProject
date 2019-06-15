package day42;

import java.util.ArrayList;
import java.util.Arrays;


public class CreateArray {

	public static void main(String[] args) {


		int[] nums= new int[2];
		int []nums1=new int[] {2,4};
		int[] nums2={1,3};
		
		int[][] n= new int[][] {{1,2},{3,4}};
		int[][]n1=new int[2][4];
		int[][] n2= new int[][] {{2,3},{4,5}};
		int[][]n3= {{2,5},{3,5}};
	
		ArrayList lst= new ArrayList<>();
		lst.add("ad");
		lst.add(3);
		System.out.println(lst);
		
		ArrayList<String> arrlist=new ArrayList<String>(Arrays.asList("A","B","C", "D","E","F","J"));		

		
		ArrayList<String> str= new ArrayList<String> ( Arrays.asList("as","kk","aa"));
	}

}
