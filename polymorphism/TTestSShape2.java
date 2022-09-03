package polymorphism;

public class TTestSShape2 {

	public static void main(String[] args) {

		SShape[] s = new SShape[3];
		s[0] = new RRectangle(5, 6);
		s[1] = new CCircle(5);
		s[2] = new TTriangle(5, 4);

		double sum = 0;

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
			sum = sum + s[i].area();
		}
		System.out.println("sum of all total area: " + sum);

	}
}
