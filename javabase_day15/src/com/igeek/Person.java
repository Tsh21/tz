package com.igeek;

public class Person extends Animal{

	@Override
	public void sleep() {
		System.out.println("躺在床上睡觉");
	}

	@Override
	public void eat() {
		System.out.println("用筷子吃饭");
	}
	
	public void study() {
		System.out.println("学习 java");
	}
	
	public void work() {
		System.out.println("工作。。。。");
	}
	
	

}
