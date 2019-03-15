package com.igeek;

//定义Person类
//父类抽取出了共性的内容，子类可以在父类基础上扩展新的属性与行为。
public class Person {
	// 成员属性
	String name;
	int height;

	public void rest() {
		System.out.println("Pserson休息..........");
	}
}
