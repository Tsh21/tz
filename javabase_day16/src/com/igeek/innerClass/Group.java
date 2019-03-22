package com.igeek.innerClass;

public class Group {
	
	private int age;
	//成员内部类
	public class Student{
		String name;

		public Student(String name,int a) {
			super();
			this.name = name;
			age = a;
		}
		
		public void output() {
			System.out.println("姓名："+this.name+";年龄："+age);
		}
		
	}
	
	//定义外部类的成员方法
	public void output() {
		//创建内部类对象
		Student stu = new Student("范旭东", 20);
		//通过stu调用内部类的成员方法
		stu.output();
	}
	
	public static void main(String[] args) {
		Group g = new Group();
		g.output();
	}

}
