package lambdaFunction;

public interface Anonymous {

	public static void cal1() {
		System.out.println("Hi This is cal1 method");
	}
	public void cal2();	


	public static void main(String[] args) {
		
		Anonymous s = () -> {
			System.out.println("i am cal2 method");
		};
		
		s.cal2();
		
		// Calling static method by class name
		Anonymous.cal1();
		
	}

}