package com.javaQ9;

public class TestClass {
	public static void main(String[] args) {

		Athlete athlete = new Athlete();
		LazyPerson lazyPerson = new LazyPerson();
		System.out.println("Athlete's routine:");
		athlete.eat();
		athlete.exercise();
		System.out.println();
		System.out.println("Lazy person's routine:");
		lazyPerson.eat();
		lazyPerson.exercise();
	}
}
