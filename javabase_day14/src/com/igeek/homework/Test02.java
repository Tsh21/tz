package com.igeek.homework;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher("王小平", 30, 8000);
		teacher.eat();
		teacher.lecture();
		Student student =new Student("李小乐", 14, 90);
		student.eat();
		student.study();
		
	}

}
