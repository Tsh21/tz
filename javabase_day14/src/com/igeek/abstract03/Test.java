package com.igeek.abstract03;

public class Test {

	public static void main(String[] args) {
		
		Geometric geometric = new Circle("圆", 10.2);
		System.out.println("面积"+geometric.getArea());
		System.out.println("周长"+geometric.getLength());
		
		Rectangle rectangle = new Rectangle("矩形", 6.5, 10.3);
		System.out.println("面积"+rectangle.getArea());
		System.out.println("周长"+rectangle.getLength());
	}

}
