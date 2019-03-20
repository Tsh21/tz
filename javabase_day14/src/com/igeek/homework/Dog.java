package com.igeek.homework;

public class Dog extends Animal {
	//品种
	private String breed;

	public Dog() {
		super();
	}

	public Dog(String name, String color,String breed) {
		//调用父类的构造方法,给父类的成员变量赋值
		super(name, color);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", toString()=" + super.toString() + "]";
	}
	
	

}
