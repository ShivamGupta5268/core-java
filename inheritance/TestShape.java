package inheritance;

public class TestShape {
	public static void main(String []args) {

		
		//Rectangle r = new Rectangle(); 
		//r.setLength(10); 
		//r.setWidth(5); 
		//r.area();
		 
	
		Shape s = new Rectangle();
		
		Rectangle r = (Rectangle) s;	//typeCasting
		r.setLength(10);
		r.setWidth(10);
		r.area();
	
	
	Circle c = new Circle();
	c.setRadius(5);
	c.area();
	
	Triangle t = new Triangle();
	t.setBase(5);
	t.setHeight(10);
	t.area();
}
}
