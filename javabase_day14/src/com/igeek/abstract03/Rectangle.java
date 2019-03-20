package com.igeek.abstract03;

public class Rectangle extends Geometric{
	
	double weight;
	double height;

	public Rectangle(String name,double weight,double height) {
		super(name);
		this.weight = weight;
		this.height = height;
	}

	@Override
	public double getArea() {
		return weight*height;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 2*(weight+height);
	}

}
