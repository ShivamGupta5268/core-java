package com.BasicJavaPrograms;

public class MethodCalling {

	public void max(int a, int b) {
		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}
	}

	public int sum(int a, int b){
		int sum = a + b;
		return sum;
	}

}
