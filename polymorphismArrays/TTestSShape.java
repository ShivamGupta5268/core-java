package polymorphismArrays;

public class TTestSShape {

	public static void main(String[] args) {
		
		SShape s = new RRectangle(5, 6);
		double r = s.area();
		
		SShape s1 = new CCircle(5);
		double c = s1.area();
		
		SShape s2 = new TTriangle(4, 7);
		double t = s2.area();
		
		System.out.println("area of rectangle: "+ r);
		System.out.println("area of circle: "+ c);
		System.out.println("area of triangle: "+ t);
	}
}
