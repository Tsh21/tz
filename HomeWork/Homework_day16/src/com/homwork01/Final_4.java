package com.homwork01;

public class Final_4 {
	public static void main(String[] args) {
		final Cat c = new Cat();
		//The final local variable c cannot be assigned.
		//It must be blank and not using a compound assignment
		//被fianl修饰的局部变量不能被赋值
		//引用类型的变量值为对象地址值，地址值不能更改
//		c = new Cat();
		c.age = 10;
	}
}
