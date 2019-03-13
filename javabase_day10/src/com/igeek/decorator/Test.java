package com.igeek.decorator;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
//		car.move();
		
		System.out.println("新增功能，飞行");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		WaterCar waterCar =new WaterCar(car);
		waterCar.move();
		System.out.println("##########");
		WaterCar waterCar2 =new WaterCar(new FlyCar(car));
		waterCar2.move();
		
		System.out.println("##########");
		AiCar aiCar  = new AiCar(waterCar2);
		aiCar.move();
	}

}
