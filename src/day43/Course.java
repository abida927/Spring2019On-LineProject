package day43;

public class Course {
	
	String name;
	int courseID;
	
	// constructor 
	  //---> a special method that being called whenever an object is created
	  // it has same name as class name 
	  // it has no return type ---(this does not mean return type is void)
	  
	  // if you don't explicitly create one like below 
	  // compiler will add a empty constructor for you  
	  // because we can not call something we don't have

	//constructor overloading
	public Course() {
		System.out.println("Course constructor");
	}
	
	public Course(String name) {
		System.out.println("passing argument");
	}
	
	public Course(String name, int CourseID) {
		System.out.println("course is "+name +" Id is "+courseID);
	}
	
	//This is not a constructor 
	  // it should not have return type
	 // and it has to have same name as Class name
	
	//public void Course() {	}
}
