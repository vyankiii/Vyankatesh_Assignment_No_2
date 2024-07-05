package com.javaQ7;

public class Developer extends Employee {
	private String programmingLanguage;

	public Developer(String name, String address, double salary, String programmingLanguage) {
		super(name, address, salary, "Developer");
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public double calculateBonus() {
		return salary * 0.15; // Developers get a 15% bonus
	}

	@Override
	public String generatePerformanceReport() {
		return "Developer Performance report for " + name + ": Outstanding code quality.";
	}

	public void writeCode() {
		System.out.println(name + " is writing code in " + programmingLanguage + ".");
	}
}
