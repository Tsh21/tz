package com.igeek;

import java.awt.Color;

/**
 * @author zx
 * @date 2019年3月7日
 * @version 1.0
 * @description：
 *	 创建对象的格式： 
		类名 对象名 = new 类名();
	对象如何访问成员呢？
		成员变量：对象名.成员变量 
		成员方法：对象名.成员方法 
 */
public class Cat {
	
	//成员属性：描述事物的属性
	String name;
	Color color;
	double weight;
	int age;
	
	//成员方法：描述事物的行为
	void eat() {
		System.out.println("eat");
	}
	
	void sleep() {
		System.out.println("sleep");
	}
	
	void say() {
		System.out.println("喵喵喵~~");
	}
	
	public static void main(String[] args) {
		//新建一个对象
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		System.out.println(cat.name);
		Cat cat2 = new Cat();
		cat2.eat();
	}

}
