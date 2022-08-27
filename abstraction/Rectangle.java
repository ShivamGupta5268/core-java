package abstraction;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area () {			//method body define to avoid abstraction 
		double total = length * width;
		System.out.println(total);
		return total;
	}

}
