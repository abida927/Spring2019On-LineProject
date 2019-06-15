package day44;

public class Job {
	
//	//*Job class
//    *
//    *      title , company , annualSalary
//  *   Encapsulate above private instance fields
	private String title;
	private String company;
	private int annualSalary;
	
	
	
public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	//    *   Create no arg constructor
//    *       to set title to “undefined”
	public Job() {
		title = "undefined";
		company="unknown";
	}
//    *       
//    *   Create 1 arg constructor to set title
	public Job(String title) {
		this.title = title;
	}
//    *   Create 3 arg constructor to set all 3 fields
	
	public Job(String title, String company, int annualSalary) {
		this.title = title;	
		this.company=company;
		this.annualSalary=annualSalary;	
		
	}
//    *
//    *   create a method called toString
//    *   it accepts no parameters and
//    *   return concatenation of all field value in nice format
//    *
	public String toString() {
		return("title is "+title+" company is "+company+" AnnualSalary is "+annualSalary);
	}


}
