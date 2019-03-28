package com.itheima.level2;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
 * 通过代码实现:
把字符串 "Hello12345World6789012" 中所有数字替换为 "#" 
提示: 字符串类的replaceAll(String regex,string str)方法,使用str替换掉当前字符串中所有与正则表达式匹配的字符

 */
public class Test17 {

	public static void main(String[] args) {
		String str = "Hello12345World6789012";
		String newStr = str.replaceAll("\\d+", "#");
		System.out.println(newStr);
	}

}
