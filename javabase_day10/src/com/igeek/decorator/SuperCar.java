package com.igeek.decorator;

//Decorator装饰角色
public class SuperCar implements ICar {
	
	private ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}

}
