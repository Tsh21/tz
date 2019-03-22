package com.igeek;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0
 * @description：
 * 静态方法不能直接访问非静态成员
 */
public class User {
	
	//静态代码块，一般里面放的是初始化的信息
	static {
		
	}
	
	//成员变量
	int id;
	String name;
	String pwd;
	
	//static修饰的是静态变量，类变量
	static String school = "泰职";

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//没有static修饰的就是一个普通的成员方法
	public void login() {
		//Cannot make a static reference to the non-static field name
		//login()调用非静态成员，编译器会报错
		System.out.println("登录："+name);
//		printSchool();
	}
	
	//静态方法要调用 静态的方法，不能是普通的成员方法
	public static void printSchool() {
		//Cannot make a static reference to the non-static method login() from the type User
//		login();
		System.out.println(school);
	}
	
	public static void main(String[] args) {
		User u = new User(1001, "wb");
		//The static method printSchool() from the type User should be accessed in a static way
//		u.printSchool();
		u.login();
		User.printSchool();//类名.静态方法
//		User.printSchool();
		System.out.println("################");
		User u2 = new User(1002, "dzy");
		System.out.println(u2.school);
//		u2.school = "江大";
		System.out.println("################");
//		u.printSchool();
//		u2.printSchool();
		
	}
	

}
