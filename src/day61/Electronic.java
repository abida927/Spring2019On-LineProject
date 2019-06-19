package day61;

import java.util.ArrayList;
import java.util.List;

public abstract class Electronic {

	public abstract void turnOn();

	public static void main(String[] args) {

		
		/*
		 * create list of electronic with 
		 * rendom 10 items
		 * 
		 * find out how many cp and how many 
		 * airconditioner are there
		 * 
		 */
		
//      Computer c1 = new Computer();
//      Computer c2 = new Computer();
//      Computer c3 = new Computer();
//      Computer c4 = new Computer();
//      AirConditioner a1 = new AirConditioner();
//      AirConditioner a2 = new AirConditioner();
//      AirConditioner a3 = new AirConditioner();
//      AirConditioner a4 = new AirConditioner();
//      
//      Electronic [] eList = {c1,c2,c3,c4,a1,a2,a4};
		
		//above works too
		
		Electronic item1 = new Computer();
		Electronic item2 = new AirConditioner();
		Electronic item3 = new Computer();
		Electronic item4 = new AirConditioner();
		Electronic item5 = new Computer();
		Electronic item6 = new AirConditioner();
		Electronic item7 = new AirConditioner();
		Electronic item8 = new AirConditioner();
		Electronic item9= new  AirConditioner();
		Electronic item10 = new AirConditioner();

		int countCP= 0;
		int countAC=0;
		
//		if (item1 instanceof Computer) {
//			countCP++;
//		}else if (item2 instanceof AirConditioner) {
//			countAC++;
//		}
		
		List <Electronic> allItems = new ArrayList<>();
		
		//the List is expecting a instance of Electronic obj
		//so we are passing any obj IS-A Electronic
		//allItems.add(item1);

		allItems.add(new Computer());
		allItems.add(new Computer());
		allItems.add(new Computer());
		allItems.add(new Computer());
		allItems.add(new AirConditioner());
		allItems.add(new AirConditioner());
		allItems.add(new AirConditioner());
		allItems.add(new AirConditioner());
		allItems.add(new AirConditioner());
		allItems.add(new AirConditioner());

		
		
		for(Electronic each : allItems) {
			
			each.turnOn();
			if (each instanceof Computer) {
				countCP++;
				((Computer) each).code();
			}else if (each instanceof AirConditioner) {
				countAC++;
				((AirConditioner) each).controlTemp();
			}
		}

		System.out.println("computer count "+ countCP);
		System.out.println("AC count "+ countAC);
		
		

		//add one functionality to each sub classes
		//add a void method with no return type
		//for each sub class;
		//Computer --->code();
		//AC ---> controlTemp()--->print contronlling Temp
		
//try to call them while looping through list of Electronic
		
		
		
		
	}
}

class Computer extends Electronic {

	public void code() {
		System.out.println("coding");
	}

    @Override
	public void turnOn() {
		System.out.println("Turning on compouter");
	}

}

class AirConditioner extends Electronic {

	@Override
	public void turnOn() {
		System.out.println("Turning on Airconditioner");
	}

	public void controlTemp() {
		System.out.println("controlling Temp");
	}
}