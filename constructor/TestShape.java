package constructor;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5, 6);
		r.area();

		Rectangle r1 = new Rectangle("Shivam", "Gupta");
		r1.fullName();

		Circle c = new Circle(6);
		c.area();
		

		Triangle t = new Triangle(3, 4);
		t.area();

	}

}
