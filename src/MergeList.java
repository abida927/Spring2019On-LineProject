import java.util.ArrayList;
import java.util.Arrays;

public class MergeList {

	public static void main(String[] args) {

		ArrayList<String>list1=new ArrayList(Arrays.asList("cat,dog"));
		ArrayList<String>list2=new ArrayList(Arrays.asList("horse,sheep"));
			
		  ArrayList<String> mergedList = new ArrayList();
			mergedList.addAll(list1);
			mergedList.addAll(list2);							
		 	
		  System.out.println("merged list:" + mergedList);		
		
	}

}
