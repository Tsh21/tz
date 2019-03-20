package com.igeek.homework03;

public class Bike extends Vehicle {

	@Override
	public void run() {
		System.out.println(getWheel()+"个轮子的"+getColor()+"的自行车骑着跑");
	}
	
	public void charge() {
		System.out.println(getWheel()+"个轮子的"+getColor()+"的自行车充电");
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String color, int wheel) {
		super(color, wheel);
		// TODO Auto-generated constructor stub
	}

}
