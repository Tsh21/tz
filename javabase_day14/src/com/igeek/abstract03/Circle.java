package com.igeek.abstract03;

public class Circle extends Geometric {
	
	double pi = 3.14;
	double radius;

	public Circle(String name,double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return pi*radius*radius;
	}

	@Override
	public double getLength() {
		return 2*pi*radius;
	}

}
