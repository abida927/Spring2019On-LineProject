package sundayQuizes;

import java.util.ArrayList;

public class removeMethod {

	public static void main(String[] args) {

		
		int a = 1;

		ArrayList<Integer>  list= new ArrayList<>();

		list.add(3);

		list.add(2);

		list.add(1);

		//list.remove(a);// = 2
		
		//System.out.println();
		
		 System.out.println( list.remove( a )  );//-->2,// remove doesn't need to assign to var, 
		 System.out.println(list.get(a));//2
        System.out.println(list);

        
        
        Integer ab=1;

        ArrayList<Integer> list1= new ArrayList<>();

        list1.add(3);

        list1.add(2);

        list1.add(1);

        System.out.println( list1.remove( ab ) );
        //remove(obj o)--->>ture or false
      
        System.out.println(list1);
        
        
	}
	

}
