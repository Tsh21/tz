package com.igeek.decorator;

public class AiCar extends SuperCar {

	public AiCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void aiDrive() {
		System.out.println("无人驾驶");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		aiDrive();
	}
	

}
