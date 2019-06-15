
public class Spartan extends Person {
	
	public static void showRace() {
		Person.showRace();
		System.out.println("Spartan");
	}
	
	public  void sleep() {
		super.sleep();
		System.out.println("Spartan do not sleep");
		super.sleep();
		super.sleep();
	}
	
	public static void main(String[] args) {
		
		//Spartan.showRace();
		Person p1 = new Person();
		p1.sleep();
		System.out.println("...........");
		Spartan obj = new Spartan();
		obj.sleep();
	}

}
