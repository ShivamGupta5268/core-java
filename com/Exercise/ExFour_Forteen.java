package com.Exercise;

public class ExFour_Forteen {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int i;
		int count1 = 0;
		int count2 = 0;
		for (i = 1; i <= 10; i+=2) {
			sum = sum + i;
			count1++;
		}
		System.out.println("Average of odd number: " + sum / count1);
		for (int j = 2; j <= 10; j+=2) {
			sum1 = sum1 + j;
			count2++;
	}
		System.out.println("Average of even number: " + sum1 / count2);

	}

}
