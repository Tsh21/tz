package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @date 2019年3月27日
 * @version 1.0
 * @description:
 * 通过正则表达式来分割字符串
 */
public class TestRegularExpression05 {
	public static void main(String[] args) {
		String str = "asdf244gagj34asf23";
		String[] a = str.split("\\d+");
		System.out.println(Arrays.toString(a));
	}
}
