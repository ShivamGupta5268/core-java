package lambdaFunction;

@FunctionalInterface
public interface OddEvenFunction {

	public void oddEven(int a);
	

	
	public static void main(String[] args) {
		
		OddEvenFunction odEvn = (a) -> {
			
			if(a % 2 == 0) {
				System.out.println("This is even number");
			}
			else {
				System.out.println("This is odd number");
			}
		};
		odEvn.oddEven(62);
	}

}
