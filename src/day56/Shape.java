package day56;

public abstract class Shape {
	
	String color;
	
	public Shape(String color) {

		this.color=color;
	}
	public abstract void calculatePerimeter();
	
	public abstract double calculateArea();

	
	//The object version of toString method is not abstract method
	//-->you can override a non- abstract method with abstract method 
	//if it's defined in abstract method
	@Override
	public abstract String toString();
}


class Circle extends Shape{
	
	double radius;
	
	public Circle(String color, double radius) {

		super( color);
		this.radius=radius;
		
	}

	@Override
	public void calculatePerimeter() {

		double c = 2*Math.PI*radius;
		
		System.out.println("calculate Perimeter is "+ c);
	}

	@Override
	public double calculateArea() {
 
		double area = Math.PI*(radius*radius);
		
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", calculateArea()=" + calculateArea()	+ "]";
	}

}

class Rectangle extends Shape{
	
	protected double width;
	protected double height;
	
	

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calculatePerimeter() {

		System.out.println("Perimeter is"+(2*width+2*height));
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}

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