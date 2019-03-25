package com.igeek;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description：
 * 算数异常：java.lang.ArithmeticException
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println("java");
		} catch (ArithmeticException e) {
			System.out.println("分母不能为0");
		}
		System.out.println("Hello");
		
	}

}
