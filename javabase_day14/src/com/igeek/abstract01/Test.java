package com.igeek.abstract01;

public class Test {
	public static void main(String[] args) {
		Actor jt = new Actor("景甜", 18);
		jt.dance();
		jt.eat();
		
		Singer xzq = new Singer("薛之谦", 30);
		xzq.eat();
		xzq.sing();
	}
}
