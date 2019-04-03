package com.igeek.exe03;

import java.util.Arrays;

/**
 * @author zx
 * @date 2019年4月2日
 * @version 1.0
 * @description:
 * 	编写一个泛形方法名称为swap，
 * 	实现指定位置数组元素的交换.数组和要交换的索引作为方法参数
 */
public class Test04 {

	public static void main(String[] args) {
		String[] s1 = {"a","b","c"};
		swap(s1, 0, 2);
		System.out.println(Arrays.toString(s1));
	}
	
	//泛形方法
	public static<T> void swap ( T[] arr,int i,int j ) {
		T tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
