package lambdaFunction;

@FunctionalInterface
public interface PrimeNumber {
	
	public void prime(int n);
	


	public static void main(String[] args) {
		
		PrimeNumber check = (n) -> {
			
			int count = 0;
			for(int i = 2; i < n; i++) {
				
				if(n % i == 0) {
					count++;
				}
			}if(count == 0) {
				System.out.println("This is prime number");
			}else {
				System.out.println("This is not prime number");
			}
		};
		check.prime(32);
	}

}
