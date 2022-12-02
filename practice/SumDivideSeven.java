package practice;

public class SumDivideSeven {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 100; i < 200; i++) {

			int n = i % 7;

			if (n == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}

		}
		System.out.println();
		System.out.println("Sum of all integer :-> " + sum);

	}
}
