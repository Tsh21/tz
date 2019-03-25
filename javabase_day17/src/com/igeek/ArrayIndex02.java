package com.igeek;

public class ArrayIndex02 {
	
	public static void f() {
		int[] a = new int[10];
		a[10] = 10;
		System.out.println("#########");
		System.out.println("hello");
	}

	public static void main(String[] args) {
		try {
			f();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught");
		}
		System.out.println("hello");
		
	}

}
