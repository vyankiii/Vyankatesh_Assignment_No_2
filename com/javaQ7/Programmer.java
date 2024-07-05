package com.javaQ7;

public class Programmer extends Employee {
	private String project;

	public Programmer(String name, String address, double salary, String project) {
		super(name, address, salary, "Programmer");
		this.project = project;
	}

	@Override
	public double calculateBonus() {
		return salary * 0.12; // Programmers get a 12% bonus
	}

	@Override
	public String generatePerformanceReport() {
		return "Programmer Performance report for " + name + ": Efficient and timely delivery.";
	}

	public void workOnProject() {
		System.out.println(name + " is working on project: " + project);
	}

}
