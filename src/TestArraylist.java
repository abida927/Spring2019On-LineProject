import java.util.ArrayList;
import java.util.Arrays;

public class TestArraylist {

	public static void main(String[] args) {

		int[] arr = {1,3,5};
		int[] arr1= {1,3,5};
		System.out.println(arr.equals(arr1));
		
		ArrayList<String>  strs= new ArrayList<>(Arrays.asList("abi","dadi"));
		ArrayList<String>  strs1= new ArrayList<>(Arrays.asList("abi","dadi"));

		System.out.println(strs.equals(strs1));
		
		ArrayList<String>  strs2= new ArrayList<>();
		strs2.remove(0);
		System.out.println(strs2);

	}

}
