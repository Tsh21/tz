package com.igeek.interfaceExtends;

public class Cylinder implements Face3{
	
	private double radius;
	private int height;
	String color;
	
	public Cylinder(double radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getArea() {
		return pi*radius*radius;
	}

	@Override
	public void setColor(String c) {
		color = c;
		System.out.println("颜色："+color);
	}

	@Override
	public void volumn() {
		System.out.println("圆柱体的体积："+getArea()*height);
	}
	
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(3.0, 2);
		cylinder.setColor("红色");
		System.out.println("面积："+cylinder.getArea());
		cylinder.volumn();
	}

}
