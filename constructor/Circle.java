package constructor;

public class Circle extends Shape {

	private int radius;
	final double pai = 3.14;

	Circle(int x) {
		radius = x;
	}

	public void area() {
		double total = pai * radius * radius;
		System.out.println(total); 	// also take return type
	}

}
