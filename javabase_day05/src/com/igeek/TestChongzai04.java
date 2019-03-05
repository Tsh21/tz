package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 方法的参数是基本类型的时候：
  		形式参数的改变不影响实际参数。
  	形式参数：用于接收实际数据的变量
  	实际参数：实际参与运算的变量
  	
  	方法的参数是基本类型的时候：形式参数的改变不影响实际参数。

 */
public class TestChongzai04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义变量
		int a = 10;
		int b = 20;
		System.out.println("a="+a+";"+"b="+b);//10,20
		change(a, b);
		System.out.println("a="+a+";"+"b="+b);//10 20

	}
	
	static void change(int a,int b) {
		System.out.println("a="+a+";"+"b="+b);//10 20
		a = b;//20
		b = a+b;//40
		System.out.println("a="+a+";"+"b="+b);//20 40
	}

}
