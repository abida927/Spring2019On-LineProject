package repl;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Repl186 {

	public static ArrayList combineAl(ArrayList<String> wordList1, ArrayList<String> wordList2){
		  
		  ArrayList<String> combine = new ArrayList<>(wordList1);
		  combine.addAll(wordList2);
		  return combine;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> str = Arrays.asList("Superman","Batman","Wonder Woman"); //it's a list , not ArrayList;

		List<String> list1 = Arrays.asList("abc","fff","kjh");
		List<String> list2 = Arrays.asList("abccccc","fddddff","hhhh");

		ArrayList <String> wordList1= new ArrayList(list1);
		ArrayList <String> wordList2= new ArrayList(list2);

		
		System.out.println(combineAl(wordList1,wordList2));

	}

}
