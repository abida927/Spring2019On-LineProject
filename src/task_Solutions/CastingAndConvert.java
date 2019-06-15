package task_Solutions;

import java.util.Scanner;

public class CastingAndConvert {

	public static void main(String[] args) {

		 double weight = 0;
		    double cal = 0;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter weight in pounds:");
		    
		    weight=scan.nextDouble();

		    int met= 10*30+8*30+6*60;
		    
		    cal=(0.0175*met*weight/2.2);
		    
		   int calInt = (int) cal;
		        
		    System.out.println("Calories Burned: " +calInt);

	}

}
