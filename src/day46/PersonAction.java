package day46;

public class PersonAction {

	public static void main(String[] args) {

		Person p1 = new Person("rachal",1.68f, 'F');
			System.out.println(Person.counter); //1

		Person p2 = new Person("phebe",1.72f, 'F');
		System.out.println(Person.counter); //2

		Person p3 = new Person("ross",1.82f, 'm');
		System.out.println(p3.counter); //3


		//correct way is to use:
		//static way to access static variable
		System.out.println(Person.race);

		//!!!!highly not recommended by using:
		//non static way to access static var
		System.out.println(p1.race);
		p2.race = "Humanoid";
		System.out.println(p2.race);
		p2.race = "Spartan";
		System.out.println(p1.race);
		//both above and below way is not recommed, use className.staticFieldName....static var belong to the class, and all
		//obj are sharing the same value!!
	
		System.out.println(p1.counter); //3	
		System.out.println(p2.counter); //3
		System.out.println(p3.counter);//3
		
		System.out.println("..............");
		
           //correct way to call static var 
		System.out.println(Person.counter);//3
		

		
		
		
	}

}
