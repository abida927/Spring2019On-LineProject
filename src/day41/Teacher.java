package day41;

public class Teacher {
	
	private String name;
	private String specialty;
	
	//getters and setters
	//it's a special method setting or updating the value 
	//fields, and getting the value from it.
	
	//setter method -->> is just like any other method
	  //it's specifically for setting//updating the field value
	  //it accepts one parameter so we can pass the new value
	  //it accepts no parameter
	
	//getter method -->> is just like any other method
		//it's specially for getting the fields value
		//and returning it from the method
		//it accepts no parameter
	
	public void setName(String newName) {
		name = newName;
		
	}
	
	public String getName() {
		return name;
	}
	

	public void SetSpecialty(String newSpecialty) {
		specialty= newSpecialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
}
