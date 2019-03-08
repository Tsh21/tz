package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 * String类的判断功能
 * boolean equals(Object obj):比较字符串的内容是否相同
   boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
   boolean startsWith(String str):判断字符串对象是否以指定的str开头
   boolean endsWith(String str):判断字符串对象是否以指定的str结尾

 */
public class TestString03 {

	public static void main(String[] args) {
		//创建字符串对象
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("###################");
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("###################");
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("he"));
		
		System.out.println("###################");
		System.out.println(s1.endsWith("He"));
		System.out.println(s1.endsWith("lo"));



	}

}
