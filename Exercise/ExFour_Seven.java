package com.Exercise;

public class ExFour_Seven {
	public static void main(String[] args) {
		int sum = 0;
		int rem;
		for (int i = 100; i < 200; i++) {
			rem = i % 7;
			if (rem == 0) {
				sum = sum + i;
				System.out.println(sum + " " + i);
				// if we want to know numbers also then print i
			}
		}
	}

}
