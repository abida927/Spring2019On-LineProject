package day43;

public class CallVehical {

	public static void main(String[] args) {

		Vehical car = new Vehical();
		
		
		car.setModel("sports car");
		System.out.println(car.getModel());
		
		car.setSpeed(10);
		System.out.println(car.getSpeed());
		car.increaseSpeed(5);
		System.out.println();
		car.decreaseBy(5);
	}

}
