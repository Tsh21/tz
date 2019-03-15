package com.igeek.extend;

public class Person {
	String name;
	int age;
	
	public void eat() {
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
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

}
