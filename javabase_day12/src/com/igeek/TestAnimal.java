package com.igeek;

public class TestAnimal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name="牛奶";
		cat.color="白色";
		cat.weight=12;
		cat.eat();
		System.out.println(cat.name+";"+cat.color);
		

	}

}
