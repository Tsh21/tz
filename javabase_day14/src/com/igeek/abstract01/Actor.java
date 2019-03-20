package com.igeek.abstract01;

public class Actor extends Person{

	public Actor() {
		super();
	}

	public Actor(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(getAge()+"岁的演员"+getName()+"在吃小龙虾");
	}
	
	public void dance() {
		System.out.println(getAge()+"岁的演员"+getName()+"跳白天鹅");
	}

}
