package com.igeek;

/**
 * @author zx
 * @date 2019年3月7日
 * @version 1.0
 * @description：
   * 类的定义
   * 
    * 对象和类的关系
    *   类是规范，根据类的定义来创建对象。 
    * 对象是类的一个具体实例，对象创建的过程就是new的过程。
  * 
 */
public class Student {
	
	private int id;
	private String name;
	private String sex;
	private int age;
	private String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String sex, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	void study(){
		System.out.println("study java");
	}
	
    void eat(){
		System.out.println("eat");
	}
    
    void sleep(){
		System.out.println("sleep");
	}
    

}
