package inheritance;

public class Circle extends Shape {

	private int radius;
	final double pai = 3.14;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {		//Method Overriding
		double total = (pai * radius * radius);
		System.out.println(total);
		return total;
	}
	
	
}
