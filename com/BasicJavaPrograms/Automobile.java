package com.BasicJavaPrograms;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;
	public int gear;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void changeGear(int g) {
		if (g >= 1 && g <= NO_OF_GEARS) {
			gear = g;
			System.out.println("Gear No: "+ g);
		}
	}

	public void accelerator() {
		switch (gear) {
		case 1:
			speed = 20;
			break;
		case 2:
			speed = 40;
			break;
		case 3:
			speed = 60;
			break;
		case 4:
			speed = 80;
			break;
		case 5:
			speed = 100;
			break;
		case 6:
			speed = 120;
			break;
		}
	}

	public void brake() {
		speed = 0;
		gear = 0;
	}

	public int getSpeed() {
		System.out.println("Your vehicle speed is: " + speed);

		if (speed > 100) {
			System.out.println("!! Please slow down your vehicle speed");
		}
		return speed;
	}
}
