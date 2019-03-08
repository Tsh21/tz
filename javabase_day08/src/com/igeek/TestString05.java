package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 *  String类的获取功能：
* 	int length():获取字符串的长度，其实也就是字符个数
* 	char charAt(int index):获取指定索引处的字符
* 	int indexOf(String str):获取str在字符串对象中第一次出现的索引
* 	String substring(int start):从start开始截取字符串
* 	String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end;[)

 */
public class TestString05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建字符串对象
		String s = "helloworld";
		
		System.out.println(s.length());
		System.out.println("###################");
		System.out.println(s.charAt(5));
		System.out.println("###################");
		System.out.println(s.indexOf("wor"));
		System.out.println("###################");
		System.out.println(s.substring(3));
		System.out.println(s.substring(5,8));

	}

}
