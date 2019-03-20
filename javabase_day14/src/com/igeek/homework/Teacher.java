package com.igeek.homework;

public class Teacher extends Person {
	
	private int salary;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age,int salary) {
		super(name, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void eat() {
		System.out.println("工资为"+salary+"元的"+getAge()+"岁的"+getName()+"老师在吃工作餐");
	}
	
	public void lecture(){
		System.out.println("工资为"+salary+"元的"+getAge()+"岁的"+getName()+"老师在讲课");
	}
	

}
