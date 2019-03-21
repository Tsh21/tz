package com.igeek;

import java.lang.reflect.Method;

/**
 * @author zx
 * @date 2019年3月21日
 * @version 1.0
 * @description：instanceof
 */
public class SubClassTypeDemo {

	public static void main(String[] args) {
		Animal a = new Person();
		a.eat();
		a.sleep();
		
		System.out.println("==============");
		Person p = (Person)a;//向下，将父类类型转成子类类型
		p.eat();
		p.sleep();
		p.work();
		p.study();
		System.out.println("==============");
		method(p);
		System.out.println("==============");
		Dog dog = new Dog();
		method(dog);
	}
	
	public static void method(Animal a){
		
		a.eat();
		if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.keepDoor();
		}
		
		if(a instanceof Person) {
			Person p = (Person)a;
			p.work();
			p.study();
		}
		
		
	}

}
