package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 *   键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 *   
 *   分析：
* 		A:键盘录入一个字符串
* 		B:截取首字母
* 		C:截取除了首字母以外的字符串
* 		D:B转大写+C转小写
* 		E:输出即可

 */
public class TestString08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请用户输入一个字符串数据：");
		String str = scanner.nextLine();
		//首字母
		String s1 = str.substring(0, 1);
//		System.out.println(s1);
		//截取除了首字母以外的字符串
		String s2 = str.substring(1);
//		System.out.println(s2);
		
	    String s3 = s1.toUpperCase()+s2.toLowerCase();
	    System.out.println(s3);

	}

}
