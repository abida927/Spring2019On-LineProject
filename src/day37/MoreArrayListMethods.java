package day37;

import java.util.ArrayList;

public class MoreArrayListMethods {

	public static void main(String[] args) {

		//watch short!!!
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(200);
		num.add(300);
		num.add(400);
		num.add(500);
		
		System.out.println(num);
		num.add(2,20000);
		System.out.println(num);

		//object.add(index, value);---->inserting items at certain location
		
		//object.set(index, value);----> Updating a value inside ArrayList item;
		
		//removing items from arrayList;              
		//object.remove(ItemValue);----> removing the object of list
		//1--->object.remove(new Integer(300));
		//2--->object.remove(Integer.valueOf(300));
		
		

		
		
		//ojbect.remove(index);--->object.remove(1)
		
		//deleting everything from the list
		//object.clear();
		
		
		//checking whether an item exist in the list
		//contain(item)---->return boolean;
		//object.contain(value);
		
		//finding out location of item
		//object.indexOf(value);
		
		//is it empty or not?--->boolean;
		//object.isEmpty();
		
		//counting items
		//object.size();
		
		}

}
