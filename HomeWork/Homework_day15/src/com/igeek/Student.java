package com.igeek;

public class Student extends Person{
	private int score;
	public Student() {
		super();
		this.score=0;
	}
	public Student(String name,int age,int score) {
		super(name,age);
		this.score=score;
	}
	//成绩为90分的15岁的李小乐学生在吃学生餐
	public void eat() {
		System.out.println("成绩为"+this.score+"的"+this.getAge()+"的"+this.getName()+"ͬ学生在吃学生餐");	
	}
	//成绩为90分的15岁的李小乐学生在学习
	public void study() {
		System.out.println("成绩为"+this.score+"的"+this.getAge()+"的"+this.getName()+"ͬ学生在学习");	
	}
}
