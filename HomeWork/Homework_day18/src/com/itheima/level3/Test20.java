package com.itheima.level3;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
 * 模拟验证手机号的过程，按照以下要求实现相关代码（友情提示：不一定要用正则）
	a.	提示用户在控制台输入手机号，用一个字符串对其进行保存
	b.	判断该手机号位数是否是11位
	c.	判断该手机号，是否都是数字
	d.	判断改手机号最后3为数字如果是相同数字则认为是靓号

 */
public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请用户输入手机号:");
		String str = sc.nextLine();
		
		if(str.length() != 11) {
			System.out.println("手机号位数有误");
			return;
		}
		
		if(!(str.matches("\\d+"))) {
			System.out.println("手机号存在非法字符");
			return;
		}
		
		//分别取出字符串的后三位
		char last1 = str.charAt(str.length()-1);
		char last2 = str.charAt(str.length()-2);
		char last3 = str.charAt(str.length()-3);
		
		if(last1 == last2 && last2 == last3) {
			System.out.println("手机号"+str+"是靓号");
		}else {
			System.out.println("手机号"+str+"是普通号");
		}

	}

}
