package com.igeek.abstract02;

/**
 * 抽象类
 * @author zx
 * @date 2019年3月20日
 * @version 1.0
 * @description：
 * 抽象类:表达概念而无法构造实体的类
 * 抽象方法：表达概念而无法实现具体代码的函数
 */
public abstract class Animal {
	
	private int age;
	private int numOfLegs;
	
	//抽象方法
	public abstract void eat();

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int age, int numOfLegs) {
		super();
		this.age = age;
		this.numOfLegs = numOfLegs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

}
