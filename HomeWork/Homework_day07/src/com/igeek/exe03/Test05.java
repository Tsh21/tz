package com.igeek.exe03;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		String[] s1 = {"a","b","c"};
		System.out.println(Arrays.toString(s1));
		reverse(s1);
		System.out.println(Arrays.toString(s1));

	}

	// 泛形方法
	public static <T> void reverse(T[] arr) {
		//在reverse方法中将数组传入的元素反转
		for(int start=0,end=arr.length-1;start<end;start++,end--) {
			T tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
		}
	}

}
