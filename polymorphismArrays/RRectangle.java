package polymorphismArrays;

public class RRectangle extends SShape {

	private int length;
	private int width;

	public RRectangle() {

	}

	RRectangle(int l, int w) {
		length = l;
		width = w;
	}

	public double area() {
		double total = length * width;
		return total;
	}

}
