package day49;

public class WarmUp {

	public static void main(String[] args) {

		/*
		 * Inheritance
		 * public Computer extends Electronic{
		 * 
		 * }
		 * 
		 * what is inherited from super class
		 * 
		 * all visible fields and methods from super class
		 *constructor is NOT inherited!!!
		 *
		 *Access Modifier :
		 *
		 *private --same class only
		 *default --same package only
		 *protected --same package + 
		 *               sub classes outside the package
		 *public -- everywhere!
		 *
		 */
		
		AudioBook a = new AudioBook();
		a.audioLength=28;
		a.author="barack";
		a.price=23.55;
		a.play();
		
		PaperBook p = new PaperBook();
		p.hardCorver=false;
		p.price=33.33;
		
		
	}

}
