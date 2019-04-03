package com.igeek;

public class Test08 {

	public static void main(String[] args) {
		Test08.function("2333");
		Test08.function(123);
	}
	
	//自定义泛型方法function.
	public  static  <E> void function(E element) {
		System.out.println(element);
	}

}
