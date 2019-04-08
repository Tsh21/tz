package com.igeek.part02;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.必须保证顺序.
 * 例如输入: aaaabbbcccddd,打印结果为: abcd
 */
public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个字符串:");
		String line = sc.nextLine();
		
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
		
		//字符串转成字符数组
		char[] charArray = line.toCharArray();
		
		for (char c : charArray) {
			linkedHashSet.add(c);
		}
		
		for (char c : linkedHashSet) {
			System.out.println(c);
		}
		
		
		
		
		

	}

}
