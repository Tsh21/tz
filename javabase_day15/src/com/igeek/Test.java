package com.igeek;

public class Test {
	
	public static void main(String[] args) {
//		Submarine submarine = new Submarine();
//		submarine.swim();
		Shape shape = new Circle(5.0);
		System.out.println("面积："+shape.getArea());
		System.out.println("周长："+shape.getLength());
		
		Rectangle rectangle = new Rectangle(6.5, 10.0);
		System.out.println("面积："+rectangle.getArea());
		System.out.println("周长："+rectangle.getLength());
		
	}
}
