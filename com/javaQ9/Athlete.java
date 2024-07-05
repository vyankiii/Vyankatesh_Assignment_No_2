package com.javaQ9;

public class Athlete extends Person {

	@Override
	public void eat() {

		System.out.println("Athlete eats a balanced diet with high protein.");
	}

	@Override
	public void exercise() {
		System.out.println("Athlete exercises rigorously, including strength training and cardio.");
	}

}
