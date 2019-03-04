package com.igeek;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0
 * @description：
 * 格式1：数据类型[] 数组名;
   格式2：数据类型 数组名[];

 */
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.声明数组
		int[] arr = new int[3];
		
		//静态初始化
		int[] arr2 = new int[]{1,2,3};
		
		int[] arr1 = {1,2,3};
		
		int a=9;
		
		//2访问
		System.out.println(a);
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//数组越界异常
//		System.out.println(arr[3]);
		System.out.println(arr.length-1);
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		//3.赋值
		System.out.println("###################");
		arr[0] = 10;
		arr[1] = 11;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}

}
