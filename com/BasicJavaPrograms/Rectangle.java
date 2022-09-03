package com.BasicJavaPrograms;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	public double area() {
		double total = length * width;
		return total;
	}
}
