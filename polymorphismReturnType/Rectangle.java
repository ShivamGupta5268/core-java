package polymorphismReturnType;

public class Rectangle extends Shape {

	private int length;
	private int base;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double area() {
		double rarea = length * base;
		System.out.println("Area of Rectangle: "+ rarea);
		return rarea;
	}
	
}
