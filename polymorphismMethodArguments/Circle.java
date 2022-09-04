package polymorphismMethodArguments;

public class Circle extends Shape {

	private int radius;
	static final double PI = 3.14;
	
	Circle(int r){
		radius = r;
	}
	public double area() {
		double total = PI * radius * radius;
		return total;
	}
}
