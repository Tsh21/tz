package com.igeek.homework02;

public class Animal {
	
	private String color;
	private int numOfLegs;
	
	public void eat() {
		System.out.println(color+numOfLegs+"条腿的动物在吃.....");
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String color, int numOfLegs) {
		super();
		this.color = color;
		this.numOfLegs = numOfLegs;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
	

}
