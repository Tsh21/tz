package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：递归:自己调用自己
 */
public class TestRecurison {
	public static void main(String[] args) {
		a();
	}
	
	public static void a() {
		System.out.println("a");
		a();
	}
	
	public static void b() {
		System.out.println("b");
	}
	

}
