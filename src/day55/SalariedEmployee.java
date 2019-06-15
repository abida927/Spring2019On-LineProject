package day55;

public class SalariedEmployee extends  Employee{

	private int monthlySalary;

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public SalariedEmployee(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	
	

	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + "]";
	}

	@Override
	public  void calculateAnualSalary() {
		
		System.out.println(monthlySalary*12);
	};
	
	
	

	
	
}
