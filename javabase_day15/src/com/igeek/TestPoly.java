package com.igeek;

public class TestPoly {

	public static void main(String[] args) {
//		Person p = new Person();
//		p.eat();
//		p.sleep();
//		p.study();
//		p.work();
		
		System.out.println("==============");
		Animal a = new Person();//默认,向上
		a.eat();
		a.sleep();
		
		System.out.println("==============");
		Person p = (Person)a;//向下，将父类类型转成子类类型
		p.eat();
		p.sleep();
		p.work();
		p.study();
		
		System.out.println("==============");
		//在强制转换时，必须是什么对象转成什么类型
		//编译的时候是不会报错的，运行的时候会报java.lang.ClassCastException
		Animal a2 = new Dog();
		Person p2 = (Person)a2;
		p2.eat();
		p2.sleep();
		p2.study();
		p2.work();
		
//		
//		System.out.println("==============");
//		Animal animal = new Person();
//		feed(animal);
//		System.out.println("==============");
//		Person p2 = new Person();
//		feed(p2);

	}
	
	public static void feed(Animal x){//x可以接收Animal的任意子类对象
		//调用该动物的吃饭方法
		System.out.println("feed方法内的动物吃饭方法被调用了");
		x.eat();
	}


}
