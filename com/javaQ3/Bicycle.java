package com.javaQ3;

public class Bicycle extends Vehicle {

	@Override
	public void speedUp(double acceleration) {
		// Bicycle-specific speed increase logic (e.g., pedal power)
		super.speedUp(acceleration * 0.8);
	}
}
