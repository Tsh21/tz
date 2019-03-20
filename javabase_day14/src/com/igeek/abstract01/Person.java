package com.igeek.abstract01;

/**
 * @author zx
 * @date 2019年3月20日
 * @version 1.0
 * @description：
 * abstract抽象
 * 有抽象方法一点是抽象类；而抽象类不一定抽象方法
 */
public abstract class Person {
	//成员变量
	private String name;
	private int age;
	
	//抽象方法
	public abstract void eat();
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
