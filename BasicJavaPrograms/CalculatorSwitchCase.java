package com.BasicJavaPrograms;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		char op = '+';
		int output = 0;
		switch (op) {
		case '+':
			output = num1 + num2;
			break;
		case '/':
			output = num1 / num2;
			break;
		default:
			System.out.print("You have given wrong operators");

		}
		System.out.println(output);
	}

}
