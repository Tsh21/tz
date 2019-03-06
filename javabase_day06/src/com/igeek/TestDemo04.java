package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @date 2019年3月6日
 * @version 1.0
 * @description：
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 */
public class TestDemo04 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	//翻转数组的内容
	public static void reverse(int[] arr) {
		for (int i = 0,j=arr.length-1  ; i <=j;  i++,j--) {
			//交换数据
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

}
