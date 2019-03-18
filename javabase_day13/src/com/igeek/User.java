package com.igeek;

/**
 * @author zx
 * @date 2019年3月18日
 * @version 1.0
 * @description：
    *       静态代码块
 */
public class User extends Person{
	String id;
	static String name;
	String password;
	
	static {
		System.out.println("User执行类的初始化操作");
		name = "戴宗一";
		printName();
	}
	
	public User() {
//		super();
		System.out.println("User无参的构造函数");
	}

	public static void printName() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		User user = new User();
//		User user = null;
	}

}
