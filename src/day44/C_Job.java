package day44;

public class C_Job {

		  private String title;
		  private String company;
		  private double annualSalary;

		  public C_Job() {
		    //System.out.println("Message from : Job() ");
		    title = "undefined";
		    company = "unknown";
		  }

		  public C_Job(String title) {

		    //System.out.println("Message from : Job(String title) ");
		    this.title = title;

		  }

		  public C_Job(String title, String company, double annualSalary) {
		    
		    //System.out.println("Message from : Job(String title, String company, long annualSalary) ");
		    this.title = title;
		    this.company = company;
		    this.annualSalary = annualSalary;
		  }
		  
		  // this is the special method that will be called
		  // when reference variable printed out directly 
		  // and method header should exactly as below 
		  // toString , does not accept parameter and return String
		//  public String toString () {
//		        
//		    String allFields = "Title: " + this.title 
//		        + " | Company: " + this.company 
//		        + " | Annual Salary:" + this.annualSalary; 
		//    
//		    return allFields;
//		    }

		  public String toString() {
		    return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
		  }
		  

		  // right click -- source -- generate getters and setters
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

		  public double getAnnualSalary() {
		    return annualSalary;
		  }

		  public void setAnnualSalary(double annualSalary) {
		    this.annualSalary = annualSalary;
		  }

		}



