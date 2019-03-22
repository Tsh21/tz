package com.igeek;

public class Chinese {
	
	//静态变量
	public static String nationality = "中国";
	
	private String name;
	private int age;
	private String occupation;
	public Chinese() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chinese(String name, int age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	

}
