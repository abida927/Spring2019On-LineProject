package task_Solutions;

import java.util.Arrays;

public class StaticBlock {
	static {
		System.out.println("Hello Cybertek, this is static block 1");//1
	}
	static {
		System.out.println("This is static block 2");//2
	}

	/*
	 * the static block's execution does not depend on the object creation, it's
	 * executed when the class is loaded, it only executes one time for per class.
	 */

	static int a;
	static boolean b;
	static String c;
	static char[] arr;

	static {
		a = 10;
		b = true;
		c = " Batch 11";
		arr = new char[] { 'A', 'B' };

	}

	public static void main(String[] args) {

		System.out.println("Hello Batch 11");//3

		System.out.println(a + " " + b + " " + c);//4--10 true batch 11 
		System.out.println(Arrays.toString(arr));//5--[A B]

	}
}
