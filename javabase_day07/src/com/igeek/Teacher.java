package com.igeek;

public class Teacher {
	
	//测试学生的学习
	public void test(Student s){
		s.study();
	}
	
	public Student getStudent(){
		Student s=new Student();
		return s;
	}


}
