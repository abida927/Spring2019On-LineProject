package day19;

import java.util.Scanner;

public class LoopingChars {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER A WORD");
		String str = scan.next();

		// how to check whether string start with a-z
		char firstChar = str.charAt(0);

		// ABC System.out.println('a' > 'b');

		if (firstChar >= 'a' && firstChar <= 'z') {

			System.out.println(" lower case letter");

		} else {

			System.out.println("NOT a-z");
		}

		// how to check whether string start with a-z

		char firstChar1 = str.charAt(0);

		// CREATE A PROGRAM LIKE ABOVE
		// to check whether user input first character
		// 1 , started with number
		// 2 , end with uppercase

		if (firstChar1 >= '0' && firstChar1 <= '9') {

			System.out.println(" number ");

		} else {

			System.out.println("NOT number ");
		}

		// 2 , end with uppercase
		char lastChar = str.charAt(str.length() - 1);

		if (lastChar >= 'A' && lastChar <= 'Z') {

			System.out.println(" UPPER CASE ");

		} else {

			System.out.println("NOT UPPERCASE ");
		}

		String mix = "Aonline132x";

		char c = mix.charAt(0);

		// check whether c is between 0 - 9
		// if( c>= 32 && c<= 41 ) {

		if (c >= '0' && c <= '9') {
			System.out.println("NUMBER!!");
		} else {
			System.out.println("NOT NUMBER!!");
		}

		if (c >= 'A' && c <= 'Z') {
			System.out.println("UPPERCASE!!");
		} else {
			System.out.println("NOT UPPERCASE!!");
		}

	}

}
