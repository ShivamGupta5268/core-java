package constructor;

public class Rectangle extends Shape {

	private int length;
	private int width;
	private String name;
	private String surName;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		double total = length * width;
		System.out.println(total);
	}
	Rectangle(String a, String b){
		name = a;
		surName = b;
	}
	public void fullName() {
		System.out.println(name +" "+ surName);
	}

}
