package com.igeek.access02;

import com.igeek.access.AccessClass;

//跨包访问权限测试,只能访问公共方法
public class AccessDemo {

	public static void main(String[] args) {
		AccessClass aClass = new AccessClass();
		//private
		//The method method() from the type AccessClass is not visible
//		aClass.method();
		//默认
		//The method method2() from the type AccessClass is not visible
//		aClass.method2();
		//protected
		//The method method3() from the type AccessClass is not visible
//		aClass.method3();
		//public
		aClass.method4();
	}

}
