package day42;

import java.awt.print.Printable;
import java.util.ArrayList;

public class RunEmpolyee{


	

	public static void main(String[] args) {

		//my own note
		//if u only write down constructor method with Parameter, 
		//and don't write down default constructor, 
		//this way of creating object will not work.
		Employee e1 = new Employee();		
		e1.name="monica";
		e1.age=33;
		e1.title="Tester";
		e1.salary=9999.99;
		e1.printAllInto();
		
		Employee e2 = new Employee();
		e2.name="Lachyn";
		e2.age=18;
		e2.title="student";
		e2.salary=100.00;
		e2.printAllInto();
		
		Employee e3=new Employee();
		e3.name="Merzet";
		e3.age=21;
		e3.title="Scrum Master";
		e3.salary=70;
		e3.printAllInto();
		
		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(e1);//index 0
		myPeople.add(e2);//index 1
		myPeople.add(e3);// index 2
		myPeople.add(new Employee());// index 3 //it's gonna be default value
		
		System.out.println(myPeople.size());//size is 4!
		
		//both of below give u hashcode...BAD!!!
		//System.out.println(myPeople.get(3));
		//System.out.println(myPeople);
		
		Employee firstItem = myPeople.get(0);
		firstItem.printAllInto();
		
		Employee thirdItem = myPeople.get(3);
		thirdItem.printAllInto();

		//without signing it to the new object
		//just call the object directly!!!!!!!!
		//cuz myPeople.get(2)is also a object!!
	    myPeople.get(2).printAllInto();
		
	    System.out.println("=====================");
	    
	    //print out the employee earn more than 10000;
		for(int i = 0; i <myPeople.size(); i++){
			Employee each = myPeople.get(i);
			if(each.salary>10000) {
				each.printAllInto();
			}
			}
	    System.out.println("****************************");

	    //count the age younger than 30
	    int count=0;
		for(Employee each : myPeople) {
			if(each.age<30) {
				count++;
			}
		}
		System.out.println(count);
		
	    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");

	    //Save all the name of all employee who are more
	    //than 25 into a String variable names
	    
	    
	    String names = "";
	    for (int i = 0; i < myPeople.size()-1; i++) {
			
	    	Employee each = myPeople.get(i);
	    	if (each.age>25) { //myPeople.get(i).age>25
	    		names = names +each.name+" ,";
	    	}
		}
		System.out.println("person who is younger than 25 "+ names);

		//rasie the salary of employee who is younger than 100 by 20k;
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each = myPeople.get(i);
			if(each.age<100) {
				each.salary += 2000;
				each.printAllInto();
			}

		}
		
		
		
	    System.out.println("constructor=====================");

		//my own note
		//in order to create object in this way , u have to  overloding constructor method.
		Employee emp1= new Employee("dave",23,"boss",2009.9);
		emp1.printAllInto();
	}

}
