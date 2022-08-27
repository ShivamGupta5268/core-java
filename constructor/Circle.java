package constructor;

public class Circle extends Shape {

	private int radius;
	final double pai = 3.14;

	Circle(int x) {
		radius = x;
	}

	public double area() {
		double total = pai * radius * radius;
		return total; 				// also // System.out.println(total);
	}

}
