package day41;

public class AirConditioner {

//	/*WARM UP 
//    Create a class called AirContitioner 
//    Add instance fields 
//        brand as String 
//        currentTemp as float  
//        isOn as boolean  

	String brand;
	float currentTemp;
	boolean isOn;

	/*
	 * Add below behaviors displayTheBrand() ; accept no paramter and print out the
	 * brand
	 */
	public void displayTheBrand() {
		System.out.println("The brand is " + brand);
	}

//        showCurrentTemp
//            accept no paramter and
//            simply display current temp on console 

	public void showCurrentTemp() {
		System.out.println(currentTemp);
	}

//        displayAllInfo 
//            accept no paramter and display all AC info 

	public void displayAllInfo() {
		System.out.println("All is AC info is " + brand + " " + currentTemp + " " + isOn);
	}

//        turnOn 
//            accept no parameter 
//            and set isOn value to true if it's not already true
	public void turnOn() {
		if (isOn == false) {
			isOn = true;
			System.out.println("Its on now");
		} else {
			System.out.println("currently AC is " + isOn);

		}
	}

//        turnOf 
//            accept no parameter 
//            and set isOn value to false if it's not already true
	public void turnOff() {
		if (isOn) {
			isOn = false;
			System.out.println("It has been turned off");
		} else {
			System.out.println("It is already off");
		}
	}

//            increaseTemp
//			it accepts one parameter int 
//			and increase the value by the amount passed	
	public void increaseTemp(int increasBy) {
		currentTemp = currentTemp + increasBy;
	}

//
//		decreaseTemp
//			it accepts one parameter int 
//			and increase the value by the amount passed
	public void decreaseTemp(int decreasBy) {
		currentTemp -= decreasBy;

		showCurrentTemp();
	}

//		setTemperature
//			it acceps one paramter int 
//			and set the value to that paramter passed 
	public void setTemperature(int targetTemp) {
		
		currentTemp = targetTemp;
		showCurrentTemp();

	}

}
