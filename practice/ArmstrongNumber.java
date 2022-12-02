package practice;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n = 153;
		int a = n;
		int sum = 0;
		
		while(n != 0) {
			int rem = n % 10;
			sum = sum + (rem*rem*rem);
			n = n / 10;
		}System.out.println(sum);
		
		if(a == sum) {
			System.out.println("This is armstrong number");
		}else {
			System.out.println("This is not armstrong number");
		}
	}

}
