package com.igeek;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Student s = new Student();
		teacher.test(s);
		System.out.println(s);
		Student s1 = teacher.getStudent();
		System.out.println(s1);
	}

}
