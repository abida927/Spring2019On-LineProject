package constructorParctice;

public class Dog extends Animal{

	String size;
	char gender;
	
	//constuctor within the same class use "this() or this(arg....)" to call   !!!
	
	
     //	super class' default constructor (no-arg) 
    //is called in sub class' constructor(any constructor) by default 
	public Dog(String size) {
         super(78);//none default super constructor is called by usSing "super(arg...)"
		System.out.println("String size arg dog constructor");
	}
	
	//super class' constructor ( except for default) MUST be called in sub class' constructor
    //(!!!   if there is no default constructor in super class   !!!!)!!!!!!!!!!!!!!!!!!!!!!
	
    //otherwise line 8 will not compile;
	public Dog() {
		super(9);
		System.out.println("no arg dog constructor");
	}
	
	public Dog(char gender) {
		super();//this is default constructor , is called by default, so no need to call it...but u can call if u want 
		//this(); constructor must be called in first line!!!otherwise give compile error!!
		System.out.println("gender arg dog constructor");

		
	}
}
