package task_Solutions;

public class Remove_duplicates {

	public static void main(String[] args) {

		String str = "AAABBBCCCDDDABCDABCD"; // expected result ==> ABCD

		String nonDup = "";

		for (int i = 0; i < str.length(); i++) {
			if (!nonDup.contains("" + str.charAt(i))) {
				nonDup += str.charAt(i);
			}

		}

		System.out.println(nonDup);

	}

}
