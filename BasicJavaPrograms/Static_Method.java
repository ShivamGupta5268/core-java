package com.BasicJavaPrograms;

public class Static_Method {
	public static void main(String[] args) {
		int value = sum(1, 2);
		System.out.println(value);
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

} 
