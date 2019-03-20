package com.igeek.abstract02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger(2, 4);
		tiger.eat();
		Pecker p = new Pecker(1, 2);
		p.eat();
		Giraffe g = new Giraffe(3, 4);
		g.eat();
		Rabbit r = new Rabbit(1, 4);
		r.eat();
		//抽象类不能new
//		Animal animal = new Animal();
		Animal animal = tiger;
	}

}
