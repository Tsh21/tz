package com.igeek;

public class Test07 {

	public static void main(String[] args) {
		GenericClass<Integer> g = new GenericClass<>();
		g.setElement(888);
		System.out.println(g.getElement());
		
		GenericClass<String> g2 = new GenericClass<>();
		g2.setElement("HELLO");
		System.out.println(g2.getElement());

	}

}
