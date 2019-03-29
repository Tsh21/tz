package com.igeek;

public class Teacher extends Person{
	private double salary;
	public Teacher(String name,int age,double salary) {
		super(name,age);
		this.salary=salary;
		
	}
	public Teacher() {
		super();
		this.salary=0;
	}
	//工资为8000元的30岁的王小平老师在吃工作餐
	public void eat() {
		System.out.println("工资为"+this.salary+"元的"+this.getAge()+"的"+this.getName()+"在吃工作餐");	
	}
	//工资为8000元的30岁的王小平老师在讲课
	public void lecture() {
		System.out.println("工资为"+this.salary+"元的"+this.getAge()+"的"+this.getName()+"在讲课");	
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
