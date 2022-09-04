package polymorphismReturnType;

public class Shape {
		
	private String color;
	private int borderWidth;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public double area() {
		return 0;
	}
	public Shape getShape(int i) {
		if(i == 1) {
			return new Circle();
		}
		if(i == 2 ) {
			return new Rectangle();
		}
		if(i == 3) {
			return new Triangle();
		}
		return null;
	}	
}

