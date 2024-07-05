package com.javaQ7;

public class CompanyApp {

	public static void main(String[] args) {

		Employee emp1 = new Manager("Ajay", "Latur", 950000, 7);
		Employee emp2 = new Developer("Vyankatesh", "Pune", 850000, "Java");
		Employee emp3 = new Programmer("Vijay", "Latur", 750000, "New App Development");

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);

		System.out.println("Bonus for " + emp1.name + ": " + emp1.calculateBonus());
		System.out.println("Bonus for " + emp2.name + ": " + emp2.calculateBonus());
		System.out.println("Bonus for " + emp3.name + ": " + emp3.calculateBonus());

		System.out.println(emp1.generatePerformanceReport());
		System.out.println(emp2.generatePerformanceReport());
		System.out.println(emp3.generatePerformanceReport());

		emp1.manageProject("Project SuperStar");
		((Manager) emp1).manageTeam();

		((Developer) emp2).writeCode();

		((Programmer) emp3).workOnProject();

	}

}
