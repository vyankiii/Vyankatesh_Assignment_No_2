package com.javaQ4;

public class TestClass {
	public static void main(String[] args) {

		OverLoadAddMethod obj = new OverLoadAddMethod();

		
		System.out.println("Sum of integers: " + obj.add(25, 50));
		System.out.println("Sum of doubles: " + obj.add(7.5, 2.5));
		System.out.println("Concatenated strings: " + obj.add("Radhe", "Krishna"));
	}

}
