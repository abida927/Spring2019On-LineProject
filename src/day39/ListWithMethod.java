package day39;

import java.util.ArrayList;

import java.util.List;

public class ListWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new ArrayList<>();
		lst.add("app");
		lst.add("abpp");
		lst.add("avvpp");
		lst.add("addpp");
		
		printItems(lst);
		
	}

	public static void add4Items(List<String> strLst) {
		strLst.add("app");
		strLst.add("abpp");
		strLst.add("avvpp");
		strLst.add("addpp");

	}
	
	public static void printItems (List<String> strL) {
		
		for(int i = 0; i<strL.size(); i++) {
			
			System.out.println(strL.get(i) + "-");
		}
		
		System.out.println();
	}
	
	//create a method that accept a number as ending point
	//and return list of integer from 1 - that number
	
	public static ArrayList<Integer> getListFrom(){
		
		return null;
}
	
}