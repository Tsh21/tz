package com.igeek.testPackage;

//import java.lang.*;
//*通配符
public class PackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("wb");
		//使用类全名访问不同包(跨包)下的其他类
		com.igeek.Person p2 = new com.igeek.Person();
		
		String name = "hello";
	}

}
