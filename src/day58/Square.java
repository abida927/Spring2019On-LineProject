package day58;

public class Square extends Shape {

	double sizeLength;

	

	public Square(String color, double sizeLength) {
		super(color);
		this.sizeLength = sizeLength;
	}

	@Override
	public void draw() {
		System.out.println("drawing square");
	}

	@Override
	public void caculateArea() {

		System.out.println(sizeLength*4);

	}

	@Override
	public String toString() {
		return "Square [sizeLength=" + sizeLength + ", color=" + color + "]";
	}

	

}
