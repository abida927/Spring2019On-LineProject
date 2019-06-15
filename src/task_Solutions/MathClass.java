package task_Solutions;

public class MathClass {

	public static void main(String[] args) {

	//  Math class methods in java:  abs(), PI=3.1415926..., max(), min(), sqrt(), E(),  pow().
		
	
			// absoulute value:  abs()    | -2| = 2;
			  int z= Math.abs(-2);
			  System.out.println(z);
			
			
			// Area of circle: Radius * Pi( 3.14 )      PI is the pi mmathimatics
			  System.out.println( Math.PI );
			  
			  double areaOfCircle = 3 * Math.PI;
			  System.out.println(areaOfCircle);
			  
			
			// squre root of:   squre root of 4  = 2    ==> sqrt()   
			  
			  double t = Math.sqrt(16);
			  System.out.println(t);
			  
			// e number  :  
			  System.out.println(Math.E);
			  
			
			// pow():   2*2=4,  2*2*2=8,   4*4=16;   4*4*4*4
			  
			  // find the 4*4*4*4*4:
			  
			   double num=	Math.pow(4, 5);
			   System.out.println(num);
			  
			  
			// max(num1, num2) ==> largest number
			   
		System.out.println(	   Math.max(100, 200)   );
		
				int z1=Math.max(100, 200);
			  System.out.println(z1);
			  
		
			 // min(num1, num2)  ===> smallest number
			  
			  System.out.println(  Math.min(400, 300)  );
			  
			  
			  
	}

}
