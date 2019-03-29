package com.homwork01;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		Car.Engine engine = car.new Engine();
		engine.work();
		car.setStatus(false);
		engine.work();
	}

}
