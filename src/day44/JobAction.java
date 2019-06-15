package day44;

import java.util.ArrayList;
import java.util.List;

public class JobAction {

	public static void main(String[] args) {



//			    *   Create few job objects and and add it to ArrayList<Job> object
//			    *   iterate over all items and print them out
//			    *
//			    * */
				
		      
				Job job1= new Job("Boss","Google",200000);
				Job job2= new Job("QA ENgineer","Google",160000);
                
				System.out.println(job1.getAnnualSalary());
				
				List<Job>  jobs = new ArrayList<>();
				jobs.add(job1);
				jobs.add(job2);
				
				
			}

		

	}


