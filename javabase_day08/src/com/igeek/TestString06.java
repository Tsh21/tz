package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 *    统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 *   分析：
* 		A:键盘录入一个字符串数据
* 		B:定义三个统计变量，初始化值都是0
* 		C:遍历字符串，得到每一个字符
* 		D:拿字符进行判断
* 			假如ch是一个字符。
* 			大写：ch>='A' && ch<='Z'
* 			小写：ch>='a' && ch<='z'
* 			数字：ch>='0' && ch<='9'
* 		E:输出结果

 */
public class TestString06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入一个字符串数据：");
		String str = scanner.nextLine();
		
		int daxie = 0;
		int xiaoxie = 0;
		int number = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				daxie++;
			}else if (ch>='a' && ch<='z') {
				xiaoxie++;
			}else if (ch>='0' && ch<='9') {
				number++;
			}else {
				System.out.println(ch+"字符非法");
			}
		}
		
		System.out.println("大写字母字符:"+daxie);
		System.out.println("小写字母字符:"+xiaoxie);
		System.out.println("数字字符:"+number);
		
	}

}
