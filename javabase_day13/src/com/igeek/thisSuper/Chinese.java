package com.igeek.thisSuper;

/**
 * @author zx
 * @date 2019年3月18日
 * @version 1.0
 * @description：
 * 在子类构造中使用this() 或 this(参数类型 参数值…)的方法
 * 可以调用本类中的其他构造方法
 */
public class Chinese extends Person{
	String address = "北京";
	int i = 200;
	
	public Chinese() {
		//使用this调用本类的两个参数的构造
		this("默认",20);
		System.out.println("子类的空参构造方法");

	}

	public Chinese(String name, int age) {
		super(name, age);
		System.out.println("子类的带参构造方法");
	}
	public Chinese(String name, int age,String address) {
		super(name, age);
		System.out.println("子类的带参构造方法");
	}

	@Override
	public void eat() {
		System.out.println("子类吃饭");
	}
	
	public void testAccess() {
		
		//访问成员时,在不考虑private修饰的情况下
		//本类对象成员用this.调用
		//父类成员用super.调用
		System.out.println(this.address);
		System.out.println(super.name);
		System.out.println(super.age);
		
		this.eat();
		super.eat();
		
		int i = 100;
		
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}



}
