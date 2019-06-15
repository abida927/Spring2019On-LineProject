package day45;

public class Student {
	String name;
	int age;
	String major;
	
	//one constructor can be called
	//in another constructor of same class
	//this(argument)
	
	//however,
	//this can be only a single call
	//this(argument can not be called more than once)
	
	//this(arg..)
	//call must be first line of your constructor
	public Student() {
		//calling constructor with 1 argument
		//to put default name
		this("No Name");//this call must be come first in constructor
		System.out.println("no arg");
	}


	public Student(String name) {
		//this.name = name;
		System.out.println("1 arg"+name);
	}


	public Student(String name, int age, String major) {
//		this.name = name;
//		this.age = age;
//		this.major = major;
		
		System.out.println("3 arg");
	}

	
}
