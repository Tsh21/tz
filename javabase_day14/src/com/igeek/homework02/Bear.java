package com.igeek.homework02;

public class Bear extends Animal {

	@Override
	public void eat() {
		System.out.println(getColor()+getNumOfLegs()+"条腿的北极熊在吃蜂蜜");
	}
	
	public void catchFish() {
		System.out.println(getColor()+getNumOfLegs()+"条腿的北极熊在抓鱼");
	}

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bear(String color, int numOfLegs) {
		super(color, numOfLegs);
		// TODO Auto-generated constructor stub
	}
	
	

}
