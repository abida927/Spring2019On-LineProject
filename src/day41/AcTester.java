package day41;

public class AcTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirConditioner ac = new AirConditioner();
		
		ac.brand = "Samsung";
		ac.currentTemp = 79.9f;
		ac.isOn = true;
		
		ac.displayTheBrand();
		ac.displayAllInfo();
		ac.turnOff();
		ac.turnOn();
		ac.showCurrentTemp();
		
		ac.increaseTemp(3);
		ac.showCurrentTemp();
		
		ac.decreaseTemp(8);
		//ac.showCurrentTemp();
		
		ac.setTemperature(100);
		//ac.showCurrentTemp();

		

	}

}
