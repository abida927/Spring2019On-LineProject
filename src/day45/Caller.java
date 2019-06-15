package day45;

public class Caller {

	 //example of rule 3!!!
	//3, recursive constructor call is not allowed----COMPLILER ERROR!!

	public Caller() {

		//this(100);// not allowed;
		System.out.println("calling no arg");
	}
	
	public Caller(int x) {
		this();
		System.out.println("calling 1 arg");
	}
	
	//this is infinite loop; 
	
}
