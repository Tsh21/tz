package com.igeek.thisSuper;

public class Person {
	String name = "Rose";
	int age = 16;
	int i = 300;
	
	public Person() {
		System.out.println("父类空参构造");
	}

	public Person(String name, int age) {
		System.out.println("父类带参构造");
		this.name = name;
		this.age = age;

	}


	public void eat() {
		System.out.println("吃饭");
	}


}
