package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
  * 判断一个字符串是否是对称字符串
  *  例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
* 
* 分析：
* 		A:键盘录入一个字符串
* 		B:写方法实现判断一个字符串是否是对称字符串
* 			把字符串反转，和反转前的字符串进行比较，如果内容相同，就说明是对称字符串
* 		C:调用方法
* 		D:输出结果

 */
public class TestStringBuilder03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入字符串数据：");
		String s = scanner.nextLine();
		boolean flag = isDui(s);
		System.out.println(flag);
	}

	public static boolean isDui(String s) {

		StringBuilder sBuilder =new StringBuilder(s);
		sBuilder.reverse();
		
		String result = sBuilder.toString();
		
		return result.equals(s);
	}

}
