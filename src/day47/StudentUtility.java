package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentUtility {

	private static ArrayList<String> studentList;

	static {
		System.out.println("Welcome to StudentUtility");
	}

	static {
//		studentList=new ArrayList<>(Arrays.asList("monic", "joy", "ross", 
//				"chan", "pheb", "charli", "rachle", "ellen", "mer", "derek"));

		studentList = new ArrayList<>();
		studentList.add("Firuz");
		studentList.add("Hurma");
		studentList.add("Shahriyor");
		studentList.add("Ylham");
		studentList.add("Busra");
		studentList.add("Farrukh");
		studentList.add("Turgun");
		studentList.add("Zeliha");
		studentList.add("Vasyl");
		studentList.add("Akbar");
		System.out.println("All students has been loaded");
	}

	public static void displayAllStudent() {
		for(int i =0; i<studentList.size(); i++) {
			System.out.println("No.: "+(i+1)+" is "+studentList.get(i));
		}
	}

	// create a static method called addStudent , accept one parameter as String
		  // name
		  // and add that name to the list , return no value
	public static void addStudent(String name) {

		studentList.add(name);
		System.out.println(studentList);

	}

	// create a static method called updateStudent
		  // accept 2 params index as int , newName as String
		  // and it will update the name of student at that location
	public static void updateStudent(int index, String newName) {

		if(index>=studentList.size()) {
			System.out.println("out of range");
			return;
		}
		studentList.set(index, newName);
		System.out.println(studentList);

	}
	

	 
	  // create a static method called removeStudent
	  // accept 1 param index as int
	  // and it will remove the name of student at that location
	
	public static void removeStudent(int index) {
		studentList.remove(index);
		System.out.println(studentList);

	}

	  // create a static method called resetTheList
	  // accept no param and delete everything in the list
	public static void resetTheList() {
		studentList.clear();
		System.out.println(studentList);
	}

	
}
