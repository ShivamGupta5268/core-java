package com.BasicJavaPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 1634;
		int rem;
		int sum = 0;
		int n = num;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem *rem * rem * rem);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("This is armstrong Number");
		} else {
			System.out.println("This is not Armstrong Number");
		}
	}

}
