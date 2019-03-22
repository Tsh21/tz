package com.igeek.access;

//同包的访问权限测试
public class TestAccess {

	public static void main(String[] args) {
		// 本类中的权限测试
		AccessClass aClass = new AccessClass();
		// private
		//The method method() from the type AccessClass is not visible
//		aClass.method();
		// 默认
		aClass.method2();
		// protected
		aClass.method3();
		// public
		aClass.method4();
	}

}
