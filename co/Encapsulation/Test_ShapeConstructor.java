package co.Encapsulation;

public class Test_ShapeConstructor {
	public static void main(String[] args) {
		
	ShapeConstructor s1 = new ShapeConstructor();
	ShapeConstructor s2 = new ShapeConstructor("Red", 3);
	
	String color = s2.getColor();
	int width = s2.getWidth();
	
	System.out.println(color);
	System.out.println(width);
	
	}

}
