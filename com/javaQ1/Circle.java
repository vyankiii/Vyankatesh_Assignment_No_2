package com.javaQ1;

public class Circle implements Shape {

	private double radius;
	final double PI = 3.14159265359;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return PI * radius * radius;
	}

}
