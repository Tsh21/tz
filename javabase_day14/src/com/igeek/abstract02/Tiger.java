package com.igeek.abstract02;

public class Tiger extends Carnivore {

	public Tiger() {
		super();
	}

	public Tiger(int age, int numOfLegs) {
		super(age, numOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("年龄为"+getAge()+"的"+getNumOfLegs()+"条腿的老虎在吃羊");
	}

}
