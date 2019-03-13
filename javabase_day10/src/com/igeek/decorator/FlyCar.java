package com.igeek.decorator;

//具体的装饰类
public class FlyCar extends SuperCar {

	public FlyCar(ICar car) {
		super(car);
	}

	public void fly() {
		System.out.println("在天上飞");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	

}
