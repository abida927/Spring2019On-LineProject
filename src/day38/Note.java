package day38;

public class Note {
	/*===^_^===>> Method OverLoading; 

	---> same method and different parameters in a class.


	===^_^===>> Method signature; 

	---> the message name and parameter combination

	===^_^===>> int x =100L; won't work.


	===^_^===>> you can call a double parameter in a method by 

	---> adding a lowercase 'd' at the end of the number.
	---> for example, doSomething(123d);
	---> for doSomething(123d) to work, you must have a method as follows;
	public static void doSomething(double x) {
			System.out.println("doSomething(double x)");
		}

	===^_^===>> 
	any primitive cannot be assigned to null; int x =null; no good!

	===^_^===>>
	Wrapper class can be assigned to null===> Integer Y = null;



	===^_^===>> what is var arg? 

	---> var arg is variable arguments where size has no limit
	public static void doSomething(int... x) {
			System.out.println("doSomething(Integer x)");
		}

	if you have this method, then you can call doSomething(4, 3, 4, 5, 6, 7, 8, 9, 0, 0, 1);

	===^_^===>>Method overloading selection order

	---> always look for the exact match
	---> look for the larger primitive types
	---> look for wrapper types
	---> var arg is used to get a fix on call

	===^_^===>> How to create ArrayList; 1st way

	--->add this to the top of the class and under the package; import java.util.ArrayList;
	---> ArrayList<String> list = new ArrayList<>();

	===^_^===>> How to create ArrayList; 2nd way

	---> you must import Arrays.List

	---> add this to the top of the class and under the package; import java.util.List;

	---> List<String> list2 = new ArrayList<> ();

	===^_^===>> How to add items to the list?

	--->		list.add("Lemonade");
	--->		list.add("Orange Juice");
	--->		list.add("Mango");
	--->		list.add("Sprite");
	--->		list.add("Club Soda");
	--->		list.add("Apple juice");
	--->		list.add("BlueBerry");
	--->		list.add("KIWI");
	--->		System.out.println(list);

	===^_^===>>//get size of all items from the list

	---> System.out.println("How many items: "+ list.size());


	===^_^===>>//getting single items

	---> System.out.println("Get the single items at 2: "+ list.get(2)); 	
			
	===^_^===>>// update or change an item

	---> list.set(0, "vinegar");
		 System.out.println(list);

	===^_^===>>// insert an item

	--->		list.add(1, "Milk");
	--->		System.out.println(list);


	===^_^===>>// check if something exists in the list

	---> boolean haveMilk = list.contains("Milk");
	---> System.out.println("Any milk in the list: " + haveMilk);
	---> System.out.println("any milk lowercase: " + list.contains("milk"));

	===^_^===>>// check the location of something

	---> int indexOfMango = list.indexOf("Mango");		
	---> System.out.println("index of mango is at: " + indexOfMango);

	===^_^===>>// remove something from the list
		
	---> list.remove("vinegar");
	---> System.out.println(list);
	 or
	 
	---> list.remove(4);
	---> list.remove("BlueBerry");
	---> System.out.println(list); 

	===^_^===>>// when using remove(object) version of the method 
			   // if we dont have the item it remain the same

	---> list.remove("KIWI");
	---> System.out.println(list);

	---> // index has to be within range or it will throw Exception
	---> list.remove(100); // like this one, because there is no index of 100 in the list we have.


	===^_^===>>// deleting all from the list

	---> list.clear();
	---> System.out.println(list);

	===^_^===>>	// chekcing the list is empty or not	
		
	---> System.out.println("checking the list is empty or not : " + list.isEmpty());

	===^_^===>>//getting all contents using classic for loop
		for(int i=0; i< list.size(); i++) {
		
			System.out.print(list.get(i)+ " - ");
		}
			System.out.println();


	===^_^===>> //getting all contents using  for each loop
		for( String each : list) {
				
				System.out.print(" | item : "+ each);
		}


	===^_^===>>		
	*/

}
