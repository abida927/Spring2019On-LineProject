package task_Solutions;

public class Frequency_String {

	public static void main(String[] args) {

		String str = "AAAABBBCCCCCDDD"; // expected result ==> A3B2C4D3

		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (!str2.contains(str.substring(i, i + 1))) {
				str2 += str.substring(i, i + 1);
			}
		}

		System.out.println(str2); // str2 = ABCD;

		String str3 = "";

		for (int z = 0; z < str2.length(); z++) {
			int num = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i + 1).equals(str2.substring(z, z + 1))) {
					num++;
				}
			}
			str3 += str2.substring(z, z + 1) + num;
		}
		System.out.println(str3);

	}

}
