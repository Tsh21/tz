package com.igeek;

public class Person {
	private String name;
	private int age;
	public Person() {
		this.name="";
		this.age=0;
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void eat() {
		//30岁的王小平在吃饭
		System.out.println(this.age+"的"+this.name+"在吃饭");
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
