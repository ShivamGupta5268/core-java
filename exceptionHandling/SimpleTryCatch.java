package exceptionHandling;

public class SimpleTryCatch {

	public static void main(String[] args) {

		int a = 15;
		int b = 0;

		try {
			int c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException e) {
			System.out.println("Not divided by Zero");
			System.out.println(e);
		}
	}
}
