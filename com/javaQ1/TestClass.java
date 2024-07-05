package com.javaQ1;

public class TestClass {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(8.0, 6.0);
		Circle circle = new Circle(7.5);
		Triangle triangle = new Triangle(6.0, 8.0);

		System.out.println("Rectangle area: " + rectangle.getArea());
		System.out.println("Circle area: " + circle.getArea());
		System.out.println("Triangle area: " + triangle.getArea());

	}

}
