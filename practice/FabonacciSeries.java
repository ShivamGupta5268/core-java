package practice;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int f0 = 0;
		int f1 = 1;
		int f2;
		System.out.print(f0 +" "+ f1);
		
		for(int i = 2; i <= 10; i++) {
			f2 = f1 + f0;
			System.out.print(" "+ f2);
			f0 = f1;
			f1 = f2;
		}
	}
}
