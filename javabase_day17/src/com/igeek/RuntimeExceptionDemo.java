package com.igeek;

/**
   *    运行时异常处理
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description:
 * 该异常在编译期不检查语法错误的.可以处理,也可以不处理.	
* 
* 	一般情况下,遇到java自身提供的运行时异常,都可以通过逻辑解决,避免异常产生.
* 	常见运行时异常:空指针异常,索引越界异常,类型转换异常
* 
* 	声明抛出处理
* 	捕获处理

 */
public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException  e) {
			System.out.println("分母不能为0");
		}
		
		System.out.println("后边的代码");
		
		try {
			method();
		} catch (Exception e) {
			System.out.println("分母不能为0");
		}
		System.out.println("hello");
		
		

	}
	
	public static void method() throws ArithmeticException{
		System.out.println(10/1);
	}

}
