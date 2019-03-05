package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 冒泡排序：两两比较，交换数据
 * [3, 56, 86, 9, 15]
 */
public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 56, 86, 9, 15};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					//数据交换
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
//				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println("#########################");
		System.out.println(Arrays.toString(arr));
	}

}
