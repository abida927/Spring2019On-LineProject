import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReverseUsingTemp {

	public static void main(String[] args) {

		ArrayList<Integer> lst1 = new ArrayList<Integer>(Arrays.asList(10, 2, 33, 24, 15));

		for (int i = 0; i < lst1.size() / 2; i++) {
			Integer temp1 = lst1.get(i);
			// updating first item value to last item value
			lst1.set(i, lst1.get(lst1.size() - 1 - i));
			// updating last item value to original first item value
			lst1.set(lst1.size() - 1 - i, temp1);
		}
		System.out.println(lst1);
	}
}
