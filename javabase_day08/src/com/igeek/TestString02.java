package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：创建字符串对象两种方式的区别
 * 
 * 通过构造方法创建的字符串对象和直接赋值方式创建的字符串对象有什么区别呢?
* 		通过构造方法创建字符串对象是在堆内存。
* 		直接赋值方式创建对象是在方法区的常量池。
* 		
* ==:
* 		基本数据类型：比较的是基本数据类型的值是否相同
* 		引用数据类型：比较的是引用数据类型的地址值是否相同

 */
public class TestString02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true
		
		String str3 = "hello";
		System.out.println(str1 == str3);//true
		System.out.println(str2 == str3);//false
		
	}

}
