package com.igeek.exercise;

public class Manager extends Employee {
	//奖金
	private double bounds;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary,double bounds) {
		super(name, salary);
		this.bounds =bounds;
	}

	@Override
	public void work() {
		System.out.println("管理酒店");
	}

	public double getBounds() {
		return bounds;
	}

	public void setBounds(double bounds) {
		this.bounds = bounds;
	}
	
	

}
