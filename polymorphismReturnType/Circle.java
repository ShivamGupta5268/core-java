package polymorphismReturnType;

public class Circle extends Shape {

	private int radius;
	static final double PI = 3.14;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double carea = PI * radius * radius;
		System.out.println("Area of Circle: "+ carea);
		return carea;
	}
	
	
}
