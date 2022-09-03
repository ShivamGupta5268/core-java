package polymorphism;

public class TTriangle extends SShape {

	private int base;
	private int height;
	
	TTriangle(){
		
	}
	TTriangle(int b, int h){
		base = b;
		height = h;
	}
	public double area() {
		double total = (base * height) / 2;
		return total;
	}
	
}
