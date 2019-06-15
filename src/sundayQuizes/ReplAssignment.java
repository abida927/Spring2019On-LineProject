package sundayQuizes;

public class ReplAssignment {

	public static void main(String[] args) {

		/*
		 * Write a loop that displays all possible 
		 * combinations of two letters where the letters
		 *  are 'z', or 'y', or 'x', or 'w', or 'v'. 
		 * The combinations should be displayed in descending 
		 * alphabetical order:
		 */
		
		for(char i ='z'; i>='v'; i--) {
			
			for(char j ='z'; j>='v';j--) {
				
				System.out.print(i);
				System.out.println(j);
				
			}
		}
		
		System.out.println("************************");
		
		String[] str = {"z","y","x","w","v"};
		
		for(int i = 0; i <str.length; i ++) {
			for(int j =0; j<str.length; j ++) {
				System.out.println(str[i]+str[j]);
			}
		}
	}

}
