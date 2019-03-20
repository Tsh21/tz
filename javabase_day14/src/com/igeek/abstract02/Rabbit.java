package com.igeek.abstract02;

public class Rabbit extends Herbivore {

	public Rabbit() {
		super();
	}

	public Rabbit(int age, int numOfLegs) {
		super(age, numOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("年龄为"+getAge()+"的"+getNumOfLegs()+"条腿的兔子在吃狗尾草");
	}

}
