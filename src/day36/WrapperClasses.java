package day36;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		Boolean b = new Boolean(true);
		Boolean b1= new Boolean("false");
		Boolean b2= Boolean.valueOf(true);
		Boolean b3= Boolean.valueOf("true");

		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		Integer i1 = new Integer (200);
		Integer i2 = new Integer ("200");
		Integer i3 = Integer.valueOf(200);
		Integer i4 = Integer.valueOf("200");
		
		                          //i1 is object, u can take action on it.  
		System.out.println("equal? "+i1.equals(200));
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

	//	int j =10; //it's not a object , 
	//	j.equals(200);//so u can not take action on it
		
		
		Character c1 = new Character('c');
		Character c2 = Character.valueOf('c');

		System.out.println(c1);
		System.out.println(c2.toString());

		
	}

}
