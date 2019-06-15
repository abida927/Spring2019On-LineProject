package day44;

import java.util.ArrayList;
import java.util.List;

public class CallC_Job {

	public static void main(String[] args) {
		C_Job j1= new C_Job();
		C_Job j2= new C_Job("Senior Sdet");
		C_Job j3= new C_Job("Scrum Master","Oracle",130000);
		C_Job j4= new C_Job("Sdet","Santander",125000);
		C_Job j5= new C_Job("Tester", "Google", 100000.0);  
		C_Job j6= new C_Job("Programmer", "Apple", 2000000); 
	    
//	    System.out.println( j1.getAnnualSalary()  );
//	    System.out.println( j1.getTitle()  );
	//    
//	    System.out.println(j1.toString() );
//	    System.out.println(j2.toString() );
//	    System.out.println(j3.toString() );
//	    System.out.println(j4.toString() );
//	    System.out.println(j5.toString() );

	    // if we print out any reference variable directly
	    // or any object directly 
//	    // it will by default call toString() 
	    
	    System.out.println(j6 ); 
	//    
	    List<C_Job> jobs = new ArrayList<>(); 
	    jobs.add(  new C_Job("Programmer", "Apple", 2000000) ) ;
	    jobs.add(j1) ; 
	    jobs.add(j2) ; 
	    jobs.add(j3) ; 
	    jobs.add(j4) ; 
	    jobs.add(j5) ; 
	    
	    //System.out.println( jobs  );
	    //System.out.println( jobs.get(0)  );
	    for( C_Job each : jobs  ) {
	      
	      System.out.println(each);
	      
	    }
	    System.out.println("---------------");
	    for (int i = 0; i < jobs.size(); i++) {
	      System.out.println( jobs.get(i) );
	    }
	    
	}

}
