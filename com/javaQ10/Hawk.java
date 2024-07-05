package com.javaQ10;

public class Hawk extends Bird {

	@Override
	public void fly() {
		System.out.println("Hawk glides swiftly through the air.");
	}

	@Override
	public void makeSound() {
		System.out.println("Hawk calls out: Kee-kee-kee!");
	}
}
