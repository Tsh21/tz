package com.igeek.abstract02;

public class Pecker extends Carnivore {

	public Pecker() {
		super();
	}

	public Pecker(int age, int numOfLegs) {
		super(age, numOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("年龄为"+getAge()+"的"+getNumOfLegs()+"条腿的啄木鸟的在吃昆虫");
	}

}
