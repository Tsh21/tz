package com.igeek.abstract03;

//抽象类
public abstract class Geometric {
	
	String name;

	public Geometric(String name) {
		super();
		this.name = name;
		System.out.println("名称:"+name);
	}
	
	//抽象方法
	public abstract double getArea();
	public abstract double getLength();

}
