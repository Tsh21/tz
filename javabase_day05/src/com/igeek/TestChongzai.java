package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 3.1	方法重载
 * 在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
	方法重载特点：
	与返回值类型无关，只看方法名和参数列表
	在调用时，虚拟机通过参数列表的不同来区分同名方法

 */
public class TestChongzai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa;
		System.out.println();

	}
	
	//方法重载
	//在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
	void add() {
		
	}
	
	void add(int a,int b) {
		
	}
	
	void add(double a,int b) {
		
	}
	
	void add(int a,double b) {
		
	}
	
	//只有参数名称不同，是不构成方法重载的
//	void add(int c,double d) {
//		
//	}
	
	//只有返回值类型不同，是不构成方法重载的
//	int add(int a,double b) {
//		return a+b;
//	}
	
	

}
