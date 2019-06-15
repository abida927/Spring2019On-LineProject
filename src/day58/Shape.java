package day58;

public abstract class Shape implements Drawable {

	//inherit everything but Static method!!!!!
	
//public static final String DWARING_TOOL="computer";
//	
//	public abstract void draw();
//	
//	public default void drawLine(int n) {
//		System.out.println("drawing "+n+" line");
//	}
	
	
	String color;
	
	
	public Shape(String color) {
		super();
		this.color = color;
	}

	public abstract void caculateArea();
	
	public abstract String toString();
	

}
