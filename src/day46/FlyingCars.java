package day46;

public class FlyingCars {

	/*
	 * Design pattern :
	 * is set of common programming pratices to solve certain problems
	 * popular interview Q !!
	 * Singleton Patterns:
	 * a pattern to make sure single instance of object is create
	 * during entire runtime of the application!!
	 * 
	 */
	
	int engineSize;
	
	private FlyingCars() {
	}
	
	public static FlyingCars getInstance() {
		
		return new FlyingCars();
	}
	
}
