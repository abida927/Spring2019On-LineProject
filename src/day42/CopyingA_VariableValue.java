package day42;

public class CopyingA_VariableValue {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.name="puppy";
		d1.breed = "pitbull";
		
		//cooying the d1 adress , and the pointer is pointing to the object yumak;
		Dog d2 = d1;
		d2.name="yumak";
		
		System.out.println(d1.name);//yumark
		
		
		d2 = new Dog();
		d2.name="Mila";
		System.out.println(d1.name);//yumark
		System.out.println(d2.name);//mila

	}
	

}
