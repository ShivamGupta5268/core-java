package polymorphismMethodArguments;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	Triangle(int b, int h){
		base = b;
		height = h;
	}
	public double area() {
		double total = (base * height) / 2;
		return total;
	}
}
