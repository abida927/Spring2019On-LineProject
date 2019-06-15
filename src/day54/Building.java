package day54;

public class Building {

	
	int mun;
	
	public Building(int num) {
		
		this.mun=num;
	}
	
	
	public static void main(String[] args) {
		
		final Building b1 = new Building(100);
	     // b1 = new Building(300);//error

	      Building b2=b1;// copying the adress from b1 to b2;
		
	      //b1.mun=200; 
		
		System.out.println(b1.mun);
	}
	
}
