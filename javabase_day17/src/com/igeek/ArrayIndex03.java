package com.igeek;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description：
 * //抛出异常
	throw e;
	
	异常：
	
 */
public class ArrayIndex03 {
	
	public static void f() {
		int[] a = new int[10];
		a[10] = 10;
		System.out.println("hello");
	}
	
	public static void g() {
		f();
	}
	
	public static void h() {
		int i=10;
		if(i<100) {
			g();
		}
	}
	
	public static void k() {
		try {
			h();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("k()");
			//抛出异常
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			k();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("main");
	}

}
