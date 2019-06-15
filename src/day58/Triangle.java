package day58;

public class Triangle extends Shape {

	double heigth;
	double base;

	

	public Triangle(String color, double heigth, double base) {
		super(color);
		this.heigth = heigth;
		this.base = base;
	}

	@Override
	public void draw() {
		System.out.println("drawing triangle");
	}

	@Override
	public void caculateArea() {
		System.out.println(base * heigth / 2);

	}

	@Override
	public String toString() {
		return "Triangle [heigth=" + heigth + ", base=" + base + ", color=" + color + "]";
	}

	

}
