package day40;

public class Phone {
	/*
	 * Create class Phone
	 * add few instance variable to define   attribute | properties| state of object 
	 * type as String , OS as String , capacity as int 
	 * add few methods 
	 *    ring -->> accept no param return no value , just print ringing
	 *   dial -->> accept one param number as int and print dialing number 
	 * 
	 * 
	 * create 3 different phone object , iphone, sumsung , pixel 
	 * assign value for all attributes 
	 * and call methods 
	 * 
	 * OPTIONALLY 
	 *   add a behavior to Phone object  
	 *   displayPhoneInfo method accept no param return no value 
	 *   --> this should print all phone attributes 
	 *   
	 * 
	 * */ 


	String type;
	String os;
	int capacity;
	
	public void displayPhoneInfo() {
		System.out.println(type+os+capacity);
	}
	
	public void ring() {
		System.out.println("ring...");
	}
	
	public void dial(long num) {
		System.out.println(num);
	}
	
	public void displayType() {
		System.out.println("Type is "+type);
	}
	
	

}
