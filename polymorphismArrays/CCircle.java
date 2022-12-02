package polymorphismArrays;

public class CCircle extends SShape {

	private int radius;
	public static final double PI = 3.14;
	
	public CCircle() {
		
	}
	public CCircle(int r) {
		radius = r;
	}
	public double area() {
		double total = PI * radius * radius;
		return total;
	}
	
}
