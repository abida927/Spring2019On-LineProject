package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl187 {
	
	public static void removeAll(ArrayList<String> wordList, String targetWord ){
		
		int count = wordList.size();
		ArrayList<String> target= new ArrayList<>();
		  for (int i = 0; i <count ; i++) {
			  if(wordList.get(i).equals(targetWord)) {
				 target.add(targetWord) ;
			  }
			
		}  
		  wordList.removeAll(target);
		  System.out.println(wordList);
		}
		

	public static void main(String[] args) {

		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo","hey"));

		removeAll(wordList,"hey");

		//now wordList is ["hey","yo"]

	}

}
