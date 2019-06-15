import java.util.ArrayList;

public class mockInterview02 {
	

	public static void main(String[] args) {

		
		int[][] nums = {{1,2},{3,4}};
		
		for(int i =0; i <nums.length; i++) {
			for(int j =0; j<nums[i].length; j++) {//inner loop : range is inside the nums[i].length!!!!!
				
				System.out.print(nums[i][j]+" ");
			}
		}
		
		System.out.println();
		
		ArrayList<String> str = new ArrayList<>();
		str.add("oh..");
		str.remove("oh");
		
		System.out.println(str);
		
		
		String str1 = "civic2019";//count letters
		
		int count=0;
		
		for(int i =0; i <str1.length(); i++) {
			
			if((str1.charAt(i)>='A' && str1.charAt(i)<='z')) {//do not forget = !!! 
				
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		String rev="";
		for(int i = str1.length()-1; i>=0; i--) {
			
			rev +=str1.substring(i,i+1);
		}
		
		if(rev.equals(str1)){
			System.out.println("It is Pal");
		}else {
			System.out.println("It's not Pal");
		}
		
		//System.out.println(rev);
	}

}
