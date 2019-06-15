package day53;

public class OnlineCourse extends Course {

	int capacity = 300; 

	  public static void main(String[] args) {
	    
	    
//	    Course java = new Course(); 
//	    System.out.println(  java.capacity );
	     
	    OnlineCourse sdet = new OnlineCourse(); 
	    //System.out.println( sdet.capacity);
	    
	    sdet.showCapacity();
	    
	    
	  }
	  
	  
	  public void showCapacity() {
		   
		System.out.println(  capacity );//sub class
	    System.out.println(  this.capacity ); //sub class
	    System.out.println(  super.capacity);//super class
	    
	  }
}
