package com.igeek.exercise;

//服务员
public class Waiter extends Employee {

	public Waiter() {
		super();
	}

	public Waiter(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("上菜与结账");
	}

}
