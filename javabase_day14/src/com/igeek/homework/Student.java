package com.igeek.homework;

public class Student extends Person {
	
	private int score;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age,int score) {
		super(name, age);
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public void eat() {
		System.out.println("成绩为"+score+"分的"+getAge()
		+"岁的"+getName()+"学生在吃学生餐");
	}
	
	public void study() {
		System.out.println("成绩为"+score+"分的"+getAge()
		+"岁的"+getName()+"学生在学习");
	}
	
	
}
