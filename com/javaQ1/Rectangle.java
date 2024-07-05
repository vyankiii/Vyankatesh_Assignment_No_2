package com.javaQ1;

public class Rectangle implements Shape {

	//Data Member
	private double lenght;
	private double width;

	// Parameterized Counstructor
	public Rectangle(double lenght, double width) {

		this.lenght = lenght;
		this.width = width;
	}

	@Override
	public double getArea() {
		return lenght * width;
	}

}
