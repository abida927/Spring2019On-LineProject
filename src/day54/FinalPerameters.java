package day54;

public class FinalPerameters {

	public static void printlItems(String item) {

		// String item = "abc efg";

		item = "some other value";
		System.out.println("the item is " + item);
	}

	
	//Final method parameter will ensure the argument that
	//pass to the methods
	//DOES NOT CHANGE!!!
	public static void printlItems1(final String item) {

		// String item = "abc efg";

		// item = "some other value"; --->can not reassign!
		System.out.println("the item is " + item);
	}

	public static void main(String[] args) {

		printlItems("abc efg");

		printlItems1("aaa");
	}

}
