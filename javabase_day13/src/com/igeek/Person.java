package com.igeek;

public class Person {
	
	String name;
	String age;
	
	public Person() {
		System.out.println("person无参的构造函数");
	}

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("eat");
	}
	
	static {
		System.out.println("Person static");
	}
	
}
