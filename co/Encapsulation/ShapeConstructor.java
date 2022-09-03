package co.Encapsulation;

public class ShapeConstructor {

	private String color;
	private int width;

	public ShapeConstructor() {
		// Default Constructor
	}
	public ShapeConstructor(String c, int w) {
		// Parameterized Constructor
		color = c;
		width = w;
	}
	public String getColor() {
		return color;
	}
	public int getWidth() {
		return width;
	}
}
