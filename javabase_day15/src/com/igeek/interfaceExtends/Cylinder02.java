package com.igeek.interfaceExtends;

public class Cylinder02 implements Face1,Face4{
	
	private double radius;
	private int height;

	public Cylinder02(double radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void volumn() {
		System.out.println("圆柱体的体积："+getArea()*height);
	}

	@Override
	public double getArea() {
		return pi*radius*radius;
	}
	
	public static void main(String[] args) {
		Cylinder02 cylinder02 = new Cylinder02(5.0, 2);
		System.out.println("面积："+cylinder02.getArea());
		cylinder02.volumn();
	}

}
