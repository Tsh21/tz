package com.igeek;

public class Circle implements Shape {
	
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return pi*radius*radius;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 2*pi*radius;
	}

}
