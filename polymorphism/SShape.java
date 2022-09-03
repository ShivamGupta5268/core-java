package polymorphism;

public class SShape {
	
	private String color;
	private int borderWidth;
	
	public SShape(){
		
	}
	public SShape(String c, int b) {
		color = c;
		borderWidth = b;
	}
	public String getColor() {
		return color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}	
	public double area() {
		return 0;
	}
}
