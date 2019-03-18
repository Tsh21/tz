package com.igeek.exercise;

public class Cook extends Employee {
	
	public Cook() {
		super();
	}

	public Cook(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void work() {
		System.out.println("做饭");
	}
	
}
