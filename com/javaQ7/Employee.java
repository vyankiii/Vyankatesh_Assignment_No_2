package com.javaQ7;

public class Employee {

	protected String name;
	protected String address;
	protected double salary;
	protected String jobTitle;

	// parameterized Constructor
	public Employee(String name, String address, double salary, String jobTitle) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public double calculateBonus() {
		return salary * 0.1; // Base bonus of 10% of salary
	}

	public String generatePerformanceReport() {
		return "Performance report for " + name + ": Excellent!";
	}

	public void manageProject(String projectName) {
		System.out.println(name + " is managing projects for " + projectName);
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Address: " + address + ", Salary: " + salary + ", Job Title: " + jobTitle;
	}

}
