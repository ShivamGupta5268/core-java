package com.BasicJavaPrograms;

public class Circle extends Shape {

	private int radius;
	public static final double PI = 3.14;
	
	public Circle(int r) {
		radius = r;
	}
	public double area() {
		double total = PI * radius * radius;
		return total;
	}
}
