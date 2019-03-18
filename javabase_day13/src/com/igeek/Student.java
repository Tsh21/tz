package com.igeek;

public class Student extends Person{
	String id;

	public Student(String id,String name,String age) {
		super(name,age);
		this.id = id;
	}

	
}
