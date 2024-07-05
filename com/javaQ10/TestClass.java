package com.javaQ10;

public class TestClass {
	
	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();
		Hawk hawk = new Hawk();

		System.out.println("Eagle's behavior:");
		eagle.fly();
		eagle.makeSound();
		System.out.println();
		System.out.println("Hawk's behavior:");
		hawk.fly();
		hawk.makeSound();
	}
}
