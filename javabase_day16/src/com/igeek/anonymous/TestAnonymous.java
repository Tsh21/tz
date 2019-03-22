package com.igeek.anonymous;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * 
 * 已经存在的父类：
	public abstract class Person{
		public abstract void eat();
	}
	定义并创建该父类的子类对象，并用多态的方式赋值给父类引用变量
	Person  p = new Person(){
		public void eat() {
			System.out.println(“我吃了”);
		}
	};

 */
public class TestAnonymous {
//	//定义并创建该父类的子类对象,并用多态的方式赋值给父类引用变量
//	Person p = new Person() {
//		
//		@Override
//		public void eat() {
//			System.out.println("我吃了");
//		}
//	};
	
	public void work() {
		System.out.println("work");
	}
	
	public static void main(String[] args) {
		TestAnonymous a = new TestAnonymous();
		//匿名对象
		new TestAnonymous().work();
	}
}
