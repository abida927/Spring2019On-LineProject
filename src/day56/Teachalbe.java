package day56;

//interface is a abstract type
//just like abstract classes
public interface Teachalbe {

	//as of java
	//interface can only have CONSTANT and abstract method
	
	//final keyword must be initialize
	public static final boolean STUDY_HARD =  true; 
	//default behavior-->psf
	//any field you have AUTOMATICALLY "public static final"
	String SCHOOL =  "Cybertek";

	//default behavior
	//any method without body or access modifier
	//it's AUTOMATICALLY "public abstract"
	
	
	// very common interview | exam questions goes as : 
	  // not providing access modifier in interface 
	  // and overriding the method with default access modifier 
	  // DOES NOT COMPILE !!! 
    void canLearn();
	
	public abstract void doHomeWork();
	
	
}
