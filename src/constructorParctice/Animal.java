package constructorParctice;

public class Animal {
	
	
	String type;
	int age;
	String color;
	int countLegs;
	
	public Animal() {
		System.out.println(" Animal default constructor");
	}
	 public Animal(int age) {
		System.out.println("age arg Animal constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog("cute type");
		
		//Animal a = new Animal();
	}

}
