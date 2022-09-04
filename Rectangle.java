package polymorphismMethodArguments;

public class Rectangle extends Shape {

	private int length;
	private int width;
	
	Rectangle(int l, int w){
		length = l;
		width = w;		
	}
	public double area() {
		double total = length * width;
		return total;
	}
}
