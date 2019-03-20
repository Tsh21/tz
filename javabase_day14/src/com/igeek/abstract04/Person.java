package com.igeek.abstract04;

public abstract class Person {
	
	private String name;
	private int age;
	private double height;
	
	public abstract void say(String content);

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
