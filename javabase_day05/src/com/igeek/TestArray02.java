package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 需求：把获取数组最值改进为方法实现，并调用方法
 */
public class TestArray02 {

	public static void main(String[] args) {
		int[] arr = { 34, 67, 10, 28, 59 };
		System.out.println(getMax(arr));
		System.out.println(getMin(arr));
	}
	
	static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int getMin(int[] arr){
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}
