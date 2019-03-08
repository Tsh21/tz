package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 * 举例：键盘录入”abc”		
* 输出结果：”cba”
* 
* 分析：
* 		A:键盘录入一个字符串
* 		B:写方法实现字符串的反转
* 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
* 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
* 		C:调用方法
* 		D:输出结果

 */
public class TestString11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入字符串数据：");
		String s = scanner.nextLine();
		
		String result = reverse2(s);
		
		System.out.println(result);

	}
	
	//倒着遍历
	public static String reverse(String s) {
		String str ="";
		for (int i = s.length()-1; i >=0; i--) {
			str += s.charAt(i);
		}
		return str;
	}
	
	public static String reverse2(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0,j=ch.length-1; i<=j; i++,j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		String sdString = new String(ch);
		return sdString;
	}
	
	

}
