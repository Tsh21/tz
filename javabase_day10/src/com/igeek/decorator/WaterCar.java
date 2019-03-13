package com.igeek.decorator;

public class WaterCar extends SuperCar {

	public WaterCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		System.out.println("在水里游。。。。");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
	

}
