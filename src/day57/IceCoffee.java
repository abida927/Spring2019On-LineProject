package day57;

public class IceCoffee implements Drinkable{

	
	int size;
	
	
	public IceCoffee(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "IceCoffee [size=" + size + "]";
	}

	@Override
	public void drink() {

		System.out.println("I miss the days that I can drink coffee ");
	}


	@Override
	public void eat() {

		System.out.println("I just finish eatint my breakfast");
	}
	
	
	
}
