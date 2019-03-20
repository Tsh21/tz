package com.igeek.homework03;

public class Car extends Vehicle {

	@Override
	public void run() {
		System.out.println(getWheel()+"个轮子的"+getColor()+"的汽车开着跑");
	}
	
	public void addGas(){
		System.out.println(getWheel()+"个轮子的"+getColor()+"的汽车加油");
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String color, int wheel) {
		super(color, wheel);
		// TODO Auto-generated constructor stub
	}
	
	

}
