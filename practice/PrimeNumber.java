package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 23;
		int count = 0;
		for(int i = 2; i < 11; i++) {
			int rem = n % i;
			if(rem == 0) {
			count++;
			}
		}if(count == 0) {
			System.out.println("This is Prime number");
		}else {
			System.out.println("This is not prime number");
		}
	}
}
