package day56;

public class RunShape {

	public static void main(String[] args) {

		Circle c = new Circle("red",2.12);
		System.out.println(c);
		c.calculatePerimeter();
		System.out.println(c.calculateArea());
		
		Rectangle rec = new Rectangle("white",3.3,4.8);
		rec.calculatePerimeter();
		System.out.println(rec.calculateArea());
		System.out.println(rec);
	}

}
