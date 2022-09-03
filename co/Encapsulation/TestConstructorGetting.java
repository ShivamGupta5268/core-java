package co.Encapsulation;

public class TestConstructorGetting {
		public static void main(String[] args) {
			ConstructorGetting cg1 = new ConstructorGetting();
			ConstructorGetting cg2 = new ConstructorGetting("ninja", "green", 2);
			
			String vehicle = cg2.getVehicle();
			String color = cg2.getColor();
			int type = cg2.getType();
			
			System.out.println(vehicle);
			System.out.println(color);
			System.out.println(type);
		}
}
