package com.javaQ3;

public class Vehicle {
	private double speed;

	public Vehicle() {
		this.speed = 0.0;
	}

	public void speedUp(double acceleration) {
		speed += acceleration;
		System.out.println("Vehicle speed increased by " + acceleration + " units.");
	}

	public double getSpeed() {
		return speed;
	}
}
