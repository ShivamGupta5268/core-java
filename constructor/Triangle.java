package constructor;

public class Triangle extends Shape {

	private int base;
	private int height;

	Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public void area() {
		double total = (base * height) / 2;
		System.out.println(total);
	}

}
