package com.javaQ1;

public class Triangle implements Shape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = 1 / 2 * base * height;
		return area;
	}

}
