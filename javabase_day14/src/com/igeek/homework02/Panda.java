package com.igeek.homework02;

public class Panda extends Animal {

	@Override
	public void eat() {
		System.out.println(getColor()+getNumOfLegs()+"条腿的大熊猫在吃竹子");
	}
	
	public void climbTree() {
		System.out.println(getColor()+getNumOfLegs()+"条腿的大熊猫在爬树");
	}

	public Panda() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panda(String color, int numOfLegs) {
		super(color, numOfLegs);
		// TODO Auto-generated constructor stub
	}
	

}
