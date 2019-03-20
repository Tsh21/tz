package com.igeek.abstract02;

public class Giraffe extends Herbivore {

	public Giraffe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Giraffe(int age, int numOfLegs) {
		super(age, numOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("年龄为"+getAge()+"的"+getNumOfLegs()+"条腿的长颈鹿在吃树叶");
	}

}
