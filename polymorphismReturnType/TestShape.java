package polymorphismReturnType;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		Circle c = (Circle) s.getShape(1);
		c.setRadius(5);
		
		Rectangle r = (Rectangle) s.getShape(2);
		r.setBase(4);
		r.setLength(6);
		
		Triangle t = (Triangle) s.getShape(3);
		t.setBase(2);
		t.setHeight(5);
		
		double x = c.area();
		double y = r.area();
		double z = t.area();
		
		System.out.println("Total area of Shape: "+ (x+y+z));
	}
}
