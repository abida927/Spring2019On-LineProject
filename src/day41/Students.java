package day41;

public class Students {
	
	//AM:
	//public/protected/default/private
	//
	public String name;
	int age;// (default AM)
	long ssn;
	
	public void displayName() {
		System.out.println("name is : "+name);
	}
	
	//it is only accessible within same class
	//which means Students class only
	private void diplayNameAndAge() {
		System.out.println("name is : "+name+" age is : "+age);
		
	}

	private void showSSN() {
		System.out.println("SSN is : "+ssn);
	}
}
