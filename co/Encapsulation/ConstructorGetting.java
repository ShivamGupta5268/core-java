package co.Encapsulation;

public class ConstructorGetting {
	private String vehicle;
	private String color;
	private int type;
	
	public ConstructorGetting() {
		// default Constructor
	}
	public ConstructorGetting(String v, String c, int t) {
		// Parameterized Constructor
		vehicle = v;
		color = c;
		type = t;		
	}
	public String getVehicle() {
		return vehicle;
	}
	public String getColor() {
		return color;
	}
	public int getType() {
		return type;
	}

}
