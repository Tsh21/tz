package com.igeek;

/**
 * @author zx
 * @date 2019年4月1日
 * @version 1.0
 * @description:
 * 泛型接口:
* 		定义：接口后<变量>如： interface B<T>{使用T完成接口定义}
*		使用：
*			1、定义类时确定类型
*			2、始终不确定类型，直到创建对象时确定类型

 */
public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger integer = new MyInteger();
		integer.method("hello");

	}

}
