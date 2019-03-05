package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * java.util.Arrays
 */
public class TestArraysUtil {

	public static void main(String[] args) {
		int[] a = {1,2};
		System.out.println(a);
		//打印数组元素的值
		System.out.println(Arrays.toString(a));
		
		int[] b = {3,56,86,9,15};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
