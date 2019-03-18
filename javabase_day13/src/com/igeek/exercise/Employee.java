package com.igeek.exercise;

/**
 * @author zx
 * @date 2019年3月18日
 * @version 1.0
 * @description：
   *   员工类
 */
public class Employee {
	
	private String name;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public void work() {
		System.out.println("工作。。。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
