package repl;

import java.util.Arrays;

public class Repl194 {

	public static boolean isAnagram(String word1, String word2) {

		boolean isAnagram=true;
		word1 = word1.toLowerCase().replaceAll(" ", "");
		word2 = word2.toLowerCase().replaceAll(" ", "");
		
		char[] word1Char=word1.toCharArray();
		char[] word2Char=word2.toCharArray();
		
		Arrays.sort(word1Char);
		Arrays.sort(word2Char);
		
		if(word1Char.length!=word2Char.length) 
			return false;


		for(int i=0; i <word1Char.length; i++) {
			if(word1Char[i]!=word2Char[i])
				return !isAnagram;		
		}

		return isAnagram;


		

		
}

	public static void main(String[] args) {

		System.out.println(isAnagram("listen", "dilent"));
	}

}
