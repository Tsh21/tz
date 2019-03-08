package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 *  char[] toCharArray():把字符串转换为字符数组
	String toLowerCase():把字符串转换为小写字符串
	String toUpperCase():把字符串转换为大写字符串
 */
public class TestString07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdef";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		//String toLowerCase():把字符串转换为小写字符串
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():把字符串转换为大写字符串
		System.out.println("HelloWorld".toUpperCase());


	}

}
