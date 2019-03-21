package com.igeek;

public class Rectangle implements Shape{
	
	double weight;
	double height;
	
	public Rectangle(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return weight*height;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 2*(weight+height);
	}

}
