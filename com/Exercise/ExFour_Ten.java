package com.Exercise;

public class ExFour_Ten {
	public static void main(String[] args) {
		int n = 153;
		int num = n;
		int sum = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + (rem * rem * rem);
		}
		System.out.println(sum);
		if (sum == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
	}

}
