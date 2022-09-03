package co.Encapsulation;

public class Shape {

	private int borderWidth;
	private String color;
	private int id;

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public void max(int a, int b) {
		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}
	}

}
