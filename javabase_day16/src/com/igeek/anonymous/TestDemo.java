package com.igeek.anonymous;

public class TestDemo {

	public static void main(String[] args) {
		//多态的使用
		Animal a = new Dog();
		a.eat();
		a.sleep();
		
		//匿名类
		//定义并创建该父类的子类对象，并用多态的方式赋值给父类引用变量
		Animal animal = new Animal() {
			
			@Override
			public void sleep() {
				System.out.println("在水里睡觉");
				
			}
			
			@Override
			public void eat() {
				System.out.println("吃虾米");
				
			}
		};
		
		animal.eat();
		animal.sleep();
		
		/**
		 * (new 类名(){
		 * 		
		 * 		方法名（参数列表）{}
		 * 		......
		 * 
		 * }).方法(参数列表);
		 */
		(new Animal() {
			
			@Override
			public void sleep() {
				System.out.println("在农场站着睡觉");
			}
			
			@Override
			public void eat() {
				System.out.println("吃草");
				
			}
		}).eat();

	}

}
