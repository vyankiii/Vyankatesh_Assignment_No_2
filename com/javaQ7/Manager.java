package com.javaQ7;

public class Manager extends Employee {
	
	private int teamSize;

	public Manager(String name, String address, double salary, int teamSize) {
		super(name, address, salary, "Manager");
		this.teamSize = teamSize;
	}

	@Override
	public double calculateBonus() {
		return salary * 0.2; // 15% bonus for managers
	}

	@Override
	public String generatePerformanceReport() {
		return "Manager Performance report for " + name + ": Excellent leadership!";
	}

	public void manageTeam() {
		System.out.println(name + " is managing a team of " + teamSize + " people.");
	}
}
