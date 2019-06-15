package day55;

public  class HourlyEmployee extends Employee {
	
	
	private int monthlyHourWorked;
	private int hourlyRate;
	
	
	public int getMonthlyHourWorked() {
		return monthlyHourWorked;
	}

	public void setMonthlyHourWorked(int monthlyHourWorked) {
		this.monthlyHourWorked = monthlyHourWorked;
	}


	public int getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	

	public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {
		super(id, name);
		this.monthlyHourWorked = monthlyHourWorked;
		this.hourlyRate = hourlyRate;
	}

	
	@Override
	public String toString() {
		return "HourlyEmployee [monthlyHourWorked=" + monthlyHourWorked + ", hourlyRate=" + hourlyRate + "]";
	}

	
	@Override
	public  void calculateAnualSalary() {
		
		int annual = monthlyHourWorked*hourlyRate*12;
		System.out.println("the salary is "+annual);
		
	};

}
