package com.igeek.access;

public class AccessClass {
	
	private void method() {
		System.out.println("私有化的方法");
	}

	void method2() {
		System.out.println("默认权限方法");
	}

	protected void method3() {
		System.out.println("受保护的方法");
	}

	public void method4() {
		System.out.println("公共的方法");
	}
	
	public static void main(String[] args) {
		//本类中的权限测试
		AccessClass aClass = new AccessClass();
		//private
		aClass.method();
		//默认
		aClass.method2();
		//protected
		aClass.method3();
		//public
		aClass.method4();
	}
}
