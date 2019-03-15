package com.igeek.level02;

import java.util.Scanner;

/*
 * 	1.键盘录入10个整数存入数组中
	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
	3.定义一个方法打印原数组和处理后的数组
 */
public class Task01 {
	public static void main(String[] args) {
//		键盘录入10个整数存入数组中
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr = {1,2,3,4,5,6,7,8,9,10,10,1};
		
		print(arr);
		swap(arr);
		print(arr);
	}
	
	/*
	 * 打印数组
	 */
	public static void print(int[] arr) {
		//shift + alt + m      将选中代码抽取到一个方法中
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	/*
	 * 定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
	 */
	public static void swap(int[] arr) {
		//定义变量 i 和 j用于检索 
		int i = 0;
		int j = arr.length - 1;
		//循环检索
		while(i < j) {//如果i < j 一直检索        //外层控制轮数
			//j先从右往左检索
			while(arr[j] % 2 == 0 && i < j) {//如果检索到偶数，就一直继续检索             //内层控制 i 和  j 移动的次数
				j--;
			}
			while(arr[i] % 2 == 1   && i < j) {//如果检索到数，就一直继续检索 
				i++;
			}
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
	}
}
