package com.igeek;

//交通工具类
public class Vehicle {
	
	public void run() {
		System.out.println("跑......");
	}
	
	public Person passenger() {
		return new Person();
	}
}


