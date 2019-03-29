package com.igeek;

public class Test {
	public static void main(String[] args) {
		Teacher t=new Teacher("王小平", 30, 8000);
		t.eat();
		t.lecture();
		Student s=new Student("李小乐", 14, 90);
		s.eat();
		s.study();
	}
}	
