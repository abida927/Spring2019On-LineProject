package sundayQuizes;

import java.util.ArrayList;

class Pizza{
	private String size;
	int topping;
	int pepperoniTopping;
	int hamTopping;
	
	public Pizza(String size, int topping, int pepperoniTopping, int hamTopping){
	  this.size = size;
	  this.topping= topping;
	  this.pepperoniTopping=pepperoniTopping;
	  this.hamTopping=hamTopping;
	}
	
	public void setSize(String size){
	  this.size = size;
	}
	
	public String getSize(){
	  return size;
	}
	
	public double calcCost(){
	  if(this.size.equals("Small")){
	    return 10+2*topping+2*pepperoniTopping+2*hamTopping;
	}else if(this.size.equals("Medium")){
	  	    return 12+2*topping+2*pepperoniTopping+2*hamTopping;
	}else{
	   return 14+2*topping+2*pepperoniTopping+2*hamTopping;

	}
}
public String getDescription(){
  return (size +" Pizza with " +topping+" Cheese toppings," 
+pepperoniTopping+ " Pepperoni toppings, and " +hamTopping+ " Ham toppings."+
"Total Price: "+calcCost());
}
	
}

public class Quize4 {
	public void removeEveryOther(ArrayList<String> words){

}
}
public class Test {

    private static void add (double  d1,  double  d2 ) {

        System.out.println("double version: " + (d1 + d2));

    }

    private static void add(Double d1, Double d2) {

       System.out.println("Double version: " + (d1 + d2));

    }

    public static void main(String[] args) {

        add(10.0, null);



