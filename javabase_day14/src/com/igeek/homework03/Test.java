package com.igeek.homework03;

public class Test {

	public static void main(String[] args) {
		Bike bike = new Bike("红色",2);
		bike.charge();
		bike.run();
		Car car = new Car("白色", 4);
		car.addGas();
		car.run();
		
		new Car("蓝色", 4).addGas();
	}

}
