package day42;

public class Employee {

	  // 4 access modifier to restrict access to members of the class 
	  //public        accessible anywhere
	  //protected     
	  //default     only in same package -- package private 
	  //private    only in same class
	
	  
	// instance variable -->> used to define properties | attribute of the objects 
	String name;
	int age;
	String title;
	//private// 
	double salary;
	
	
	  // instance methods --->> 
	  // used to read or manipulate the  properties | attribute of the objects	
	public void printAllInto() {
		System.out.println("name is:<"+name+"> age is <"
	               +age+"> title is <"+title+"> salary is <"+salary+">");
	}
	
	
	
	
	
	
	
	
	
	
	
	//default constructor method
	public Employee() {
		
	}
	
	//overloding construcor method
	public  Employee(String name,int age,String title,double salary) {
		this.name=name;
		this.age=age;
		this.title=title;
		this.salary=salary;
	}
	
	//in order for u to create object in both way , 
	//u have to write down both constructor method
}
