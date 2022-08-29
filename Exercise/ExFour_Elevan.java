package com.Exercise;

public class ExFour_Elevan {
	public static void main(String[] args) {
		int n = 23;
		int count = 0;
		int rem;
		int i;

		for (i = 2; i < n; i++) {
			rem = n % i;
			if (rem == 0) {
				count++;
				System.out.println("Not a Armstrong Number");
				break;

			}
			if (count == 0) {
				System.out.println("This is armstrong number");
				break;
			}
		}
	}
}
