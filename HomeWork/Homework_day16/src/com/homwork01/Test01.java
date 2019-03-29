package com.homwork01;

public class Test01 {
	
	static {
		System.out.println("Test 静态代码块");
	}
	public Test01(){
		System.out.println("Test01 构造方法");
	}
	public static void main(String[] args) {
		System.out.println("Test main方法");
		Test01 tt = null;
//		Test01 t = new Test01();
//		Test01 t2 = new Test01();
	}
	
	
}
