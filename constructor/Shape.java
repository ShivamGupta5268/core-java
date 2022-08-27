package constructor;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	/*
	 * public void area() {
	 * 
	 * }
	 */
	
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
	
	  public void Shape() { 
		  System.out.println("i am shape area method");
		  }
	 
}
