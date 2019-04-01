package com.igeek;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 
 * 泛型方法
 * 
 * 定义：方法返回值前<变量>如：public <T> void method(){使用T}
 * 使用：调用方法时确定类型
 * 
 */
public class MyClassTypeDemo2 {

	public static void main(String[] args) {
		
		MyClassType2 classType2 = new MyClassType2();
		
		classType2.method("abc");
		classType2.method(22);

	}

}
