package com.Exercise;

public class ExFour_five {
	public static void main(String[] args) {
		int n = 246852;
		int rem;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			System.out.print(rem);

		}
	}
}
