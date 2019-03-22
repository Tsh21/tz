package com.igeek.anonymous;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("dog eat a bone");
	}

	@Override
	public void sleep() {
		System.out.println("趴着睡");
	}

}
