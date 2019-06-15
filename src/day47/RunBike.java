package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class RunBike {

	public static void main(String[] args) {

		Bike b1= new Bike("mama",3,20);
		Bike b2= new Bike("papa",4,40);
		Bike b3= new Bike("bro",5,60);

		Bike.showCurrentCount();
		System.out.println(b1);
		b2.speedUp(5);
		System.out.println(b2);
		b3.slowDown(8);
		System.out.println(b3);
		
		ArrayList<Bike> allBikes = new ArrayList<>(Arrays.asList(b1,b2,b3));
		
		for(Bike each : allBikes) {
			
			System.out.println(each);
			
			System.out.println(each.getId()+each.getBrand());
			each.speedUp(10);
			System.out.println(each.toString());
		}
		
		System.out.println("................");
		
		for(int i =0; i <allBikes.size(); i++) {
			
			System.out.println(allBikes.get(i));
			System.out.println(allBikes.get(i).getId()+allBikes.get(i).getBrand());
			
		}
		
		Bike.resetCount();
		
		Bike b4= new Bike("sis",3,20);
		Bike b5= new Bike("kid",4,40);
		
		Bike.showCurrentCount();
	}
	

}
