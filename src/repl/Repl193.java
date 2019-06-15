package repl;

public class Repl193 {

	public static boolean isPalindrome(String check) {

		String rev = "";
		check = check.replaceAll(" ", "");
	
		for (int i = check.length() - 1; i >= 0; i--) {
			
				rev += check.charAt(i);
			}
		
		boolean isPalindrome = true;
		if (rev.equalsIgnoreCase(check)) {
			return (isPalindrome);
		} else {
			return (!isPalindrome);
		}
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome("Noon"));
	}

}
