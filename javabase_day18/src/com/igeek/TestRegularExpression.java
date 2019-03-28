package com.igeek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
 *     正则表达式 RegularExpression
 *     
 *     1.普通字符 a ,vbd
 *     2.转义字符  \t \n \" \\ \' \^
 *     3.预定义字符 \w \W \d \D . \s \S	
 *     4.\b  位置非\w
 *       ^ 与字符串开始的地方匹配
 *       $ 与字符串结束的地方匹配
 *     5.数量词
 *       	？ +  *
 *       {n} {n,} {n,m}
 *     6.[]通过方括号匹配，能够匹配方括号中的任意一个字符
 *       [^] 匹配方括号中之外的任意一个字符
 *       [a-z];[0-9];[a-zA-Z0-9]
 *     7. | :分支结构，左右两边表达式之间“或”关系，匹配左边或者右边
 *     8. () : 整体
 *     
 *    java.util.regex.Matcher
 *    java.util.regex.Pattern
 */
public class TestRegularExpression {

	public static void main(String[] args) {
		
		//拿到Pattern对象，表达式的对象
		Pattern p = Pattern.compile("\\w+");
		
		//创建MaMatcher对象
		Matcher m = p.matcher("ahsfkfh&&2143");
		
		//尝试将整个区域与模式匹配。
//		boolean flag = m.matches();
//		System.out.println(flag);
		//Attempts to find the next subsequence of the input sequence 
		//that matches the pattern. 
		//该方法扫描输入的序列，查找与该模式匹配的下一个子序列
//		boolean flag2 = m.find();
//		
//	
//		System.out.println(flag2);
//		System.out.println(m.find());
		//Returns the input subsequence matched by the previous match. 
		// 返回由以前匹配操作所匹配的输入子序列。
//		System.out.println(m.group());
//		System.out.println(m.find());
//		System.out.println(m.group());
		
		//Returns the input subsequence captured by the given group during the previous match operation.
		//返回在以前匹配操作期间由给定组捕获的输入子序列。
		while(m.find()) {
			System.out.println(m.group());
//			System.out.println(m.group(0));
		}
		
	}

}
