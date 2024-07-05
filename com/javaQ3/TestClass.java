package com.javaQ3;

public class TestClass {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speedUp(40.0);

		Bicycle myBicycle = new Bicycle();
		myBicycle.speedUp(15.0);

		System.out.println("Car speed: " + myCar.getSpeed());
		System.out.println("Bicycle speed: " + myBicycle.getSpeed());
	}
}
