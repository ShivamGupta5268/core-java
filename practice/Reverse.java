package practice;

public class Reverse {

	public static void main(String[] args) {
		
		int n = 2468;
		int a = 0;
		
		while(n != 0) {
			int rem = n % 10;
			n = n / 10;
			
			a = (a * 10) + rem;
		}
			System.out.print(a);

	}
}
