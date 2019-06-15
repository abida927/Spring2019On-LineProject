package day55;

/*
 * HourlyEmployee class 

	private instance fields 
		id 
		name
		MonthlyHourWorked
		hourlyRate

	constructor to set all 
	add getters and setters 
	add toString method 

  method 
	calculateAnualSalary()

SalariedEmployee

private instance fields 
		id 
		name
		monthlySalary 
 method 
	calculateAnualSalary()
	add getters and setters 
	add toString method 

TASKS : 
	ABSTRACT out an Employee class out of these two classes 
	to make it abstract to provide reusable fields 
	and abstract method to provide the idea rather than implementation detail 
 */
   public abstract class Employee {
	   
	   private int id;
	   private String name;
	  
	   
	   
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public abstract void   calculateAnualSalary(); 

}
