package com.igeek.access02;

import com.igeek.access.AccessClass;

public class TestAccess extends AccessClass {
	
	public static void main(String[] args) {
		//跨包访问权限测试,只能访问公共方法
		AccessClass aClass = new AccessClass();
		//private
//		aClass.method();
		//默认
//		aClass.method2();
		//protected
//		aClass.method3();
		//public
		aClass.method4();
		
		TestAccess testAccess = new TestAccess();
		testAccess.method3();
		
	}
	//子类可以访问父类的公共和受保护的方法，无论是否同包
	public void methodTest() {
		//private
//		super.method();
//		super.method2();
		//protected
		super.method3();
		//public
		super.method4();
	}

}
