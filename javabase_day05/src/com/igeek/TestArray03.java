package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 需求：写一个方法，用于对数组进行求和，并调用方法。
 * 提示：Alt+/
 */
public class TestArray03 {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(sum(arr));
	}
	
	static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];//sum += arr[i];
		}
		return sum;
	}

}
