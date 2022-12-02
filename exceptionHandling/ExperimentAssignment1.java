package exceptionHandling;

public class ExperimentAssignment1 {

	public static void main(String[] args) {
		
		try {
			try {
				double d = 15/0;
				System.out.println(d);
			}catch(ArithmeticException e){
				System.out.println("You can not divided by Zero");
			}
			String s = "Shivam";
			System.out.println(s.charAt(6));
		}
		catch (StringIndexOutOfBoundsException e1) {	
			System.out.println("Your String is small");
		}	
			try {	
				String d = null;
				System.out.println(d.charAt(2));
				
			} catch (NullPointerException e2) {
				System.out.println("Your string is empty");
			}
		finally {
			System.out.println("Final code");
		
			try {
				double d = 15/0;
				System.out.println(d);
			} catch (ArithmeticException e3) {
				System.out.println("final block try catch");
			}
		}
	}
}
