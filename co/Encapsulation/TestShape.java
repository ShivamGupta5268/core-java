package co.Encapsulation;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setBorderWidth(5);
		s.setColor("Red");
		s.setId(10);
		s.max(28, 30);

		int a = s.getBorderWidth();
		String b = s.getColor();
		int c = s.getId();
		int d = s.sum(10, 25);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
