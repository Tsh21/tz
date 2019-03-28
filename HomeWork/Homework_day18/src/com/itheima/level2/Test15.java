package com.itheima.level2;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
 * 使用正则表达式切割字符串
* 192.168.105.27 按照  . 号切割字符串
* 18 22 40 65 按照空格切割字符串
    提示: 由于 . 号 在正则表达式中用于匹配除换行符以外的任意字符,会把字符串切的连渣都不剩,
    此处使用 . 号需要转义; 使用\\.作为切割使用正则表达式
 */
public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "192.168.105.27";
		
		String[] strs1 = str1.split("\\.");
		
		for (int i = 0; i < strs1.length; i++) {
			System.out.print(strs1[i]+" ");
		}
		System.out.println();
		String str2 = "18  22  40  65";
		String[] strs2 = str2.split("\\s+");
		for (int i = 0; i < strs2.length; i++) {
			System.out.print(strs2[i]+" ");
		}
		
		
		
	}

}
