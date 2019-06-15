
public class Employee {

	private String username ="123123";
	private boolean password = true;
	private float ssn =  new Float("10");  // it executes the valueOf 
			// float ssn  = Float.valueOf("10");   returns wrapper Float ,    unboxing
			// float ssn = Float.parseFloat( "10" );    returns primitive
	
	
	/*
	 access modifers: public, protected, default, private
	 specifiers:  static
	 
	 */
	
	
	public String getusername() {
		return username;
	}
	
	public float getSSN() {
		return ssn;
	}
	
	public void setSSN( float ssn) {
		this.ssn = ssn;
	}
	
	
	
}




