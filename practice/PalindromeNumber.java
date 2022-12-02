package practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n = 1213121;
		int num = n;
		int sum = 0;
		
		while(n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = (sum * 10) + rem;
		}System.out.println(sum);
		
		if(num == sum) {
			System.out.println("This is Palindrome Number");
		}else {
			System.out.println("This is not Palindrome Number");
		}
	}
}
