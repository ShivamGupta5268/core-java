package com.BasicJavaPrograms;

public class TestShape {

	public static void main(String[] args) {
		
		Shape [] s = new Shape[3];
		s[0] = new Rectangle(10,5);
		s[1] = new Circle(5);
		s[2] = new Triangle(3,6);
		
		System.out.println(s[0].area());
		
	}
}
