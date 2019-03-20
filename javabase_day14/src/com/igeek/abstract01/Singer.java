package com.igeek.abstract01;

public class Singer extends Person{

	public Singer() {
		super();
	}

	public Singer(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println(getAge()+"岁的歌手"+getName()+"在吃大闸蟹");
	}
	
	public void sing() {
		System.out.println(getAge()+"岁的歌手"+getName()+"在演唱丑八怪");
	}
}
