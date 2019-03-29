package com.homwork01;

//final修饰的变量称为常量，这些变量只能赋值一次
public class Final_3 {
	public static void main(String[] args) {
		final int a = 10;
		//The final local variable a cannot be assigned. 
		//It must be blank and not using a compound assignment
		//final修饰的变量称为常量，这些变量只能赋值一次
//		a = 20;
		//final修饰的变量称为常量，这些变量只能赋值一次
		final int b;
		b = 5;
		//The final local variable b may already have been assigned
//		b = 10;
	}
}
