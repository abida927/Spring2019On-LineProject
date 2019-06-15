package thursdayOfficeHour;

public class Quize {

	class cybertek{
		
		public cybertek() {
			
		}
	}

	class Apple{
		
		public Apple(int a) {
			
		}
		
		
	}


	 class kahoot04 {
		int num1;
	 }
		public static void main(String[] args) {
//			Apple obj= new Apple();  // // constructor has to be exits and visible
			
		//	cybertek obj = new cybertek();  // constructor has to be exits and visible
			
			
			// System.out.println( num1++ );  instance variables belongs to the object, static belongs to the class
			
	//		System.out.println( new kahoot04().num1 );
			
			
			
			int[] arr= {1,2,3,4,5};
			
			for(int i=0; i < arr.length; i++) {
				
				
				if(arr[i]==3) {
					continue;
					// break: exits the loop and switch statment
					// return exits the method
				}
							
				System.out.println(arr[i]);  
				
			}
			
			System.out.println("World");
			System.out.println("Cybertek");
			
			
			
			for(int i=0; i < 2; i++) {
			if( 10 > 9 ) {
				
				continue;
				// System.out.println("Hello");    // returm, break, continue 
			}
		}
		}}		
			
			
		
		
	 
		
		
		
		
		
		
		
		
		
		
		/*
		 
		 Constructor:   special method. execution depends on the creation of the object
		 
		1. every class MUST have constructor, if there isn't any declared then compiler will give default constructor(no-arg constructor)  
		2. constructor' method CAN NOT have Return-Type and specifier ( only have access modifier and classname (required)  )
		3. constructor' method name MUST be same with className
		4. constructor' execution depends on the creation of the object
		5. Only Constructor can call the constructor, other methods or blocks cannot call the constructor
		6. constructor CAN NOT be called by constructor name, MUST use this or super (to call superclass' constructor) keywords.
		7. constructor CAN NOT call or contain itself
		8. constructor CAN NOT call more than one constructor
		9. in constructor' body  constructor call needs to be the first step.
		10. class' object MUST be created with the existing constructors 
		
		
		11. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
		12. super class' constructor ( except for default) MUST be called in sub class' constructor
					(if there is no default constructor in super class)		
			
			
		Encapsulation: hides the instance variables ( usually have private access modifiers )
		 
					 getter: Read ONLY
					 	1. return method ( Return-Type cannot be void)
					 	2. access modifier Should not be private
					 	3. return Type must be same data-type with the instance variable'
					 	4. does not have any argument
					 	
					 	
					 Setter: Modify
					 	1. none return method ( void)
					 	2. access modifier should not be private
					 	3. must have an argument and argument' data-type MUST be same with instance variable'
					 	4. argument must be initialized to the instance variable
			  
		 */

