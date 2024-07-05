package com.javaQ3;

public class Car extends Vehicle {

	@Override
	public void speedUp(double acceleration) {
		// Car-specific speed increase logic (e.g., turbo boost)
		super.speedUp(acceleration * 1.5);
	}
}
