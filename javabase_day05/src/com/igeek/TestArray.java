package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 需求：把遍历数组改进为方法实现，并调用方法
 * //[元素1, 元素2, 元素3, ...]
 */
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		print(arr);
	}
	
	static void print(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) {
				System.out.println(arr[i]+"]");
			}else {
				System.out.print(arr[i]+ ",");
			}
		}
	}

}
