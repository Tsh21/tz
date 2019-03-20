package com.igeek.homework;

public class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name, String color) {
		//调用父类的构造方法,给父类的成员变量赋值
		super(name, color);
	}

	@Override
	public String toString() {
		return "Cat [toString()=" + super.toString() + "]";
	}

	

}
