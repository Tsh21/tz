package com.igeek;

public class Person {
	
	String name;
	String age;
	
	public Person() {
		System.out.println("person:"+name+";"+age);
	}

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("eat");
	}

}
