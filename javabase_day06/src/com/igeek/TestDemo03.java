package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月6日
 * @version 1.0
 * @description：
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个评委打分的平均值。
 * 请写代码实现。(不考虑小数部分)
 */
public class TestDemo03 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		//评委打分
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请第"+(i+1)+"位评委评分（0-100）：");
			int number = scanner.nextInt(); 
			arr[i] = number;
		}
		//求最大值
		int max= getMax(arr);
		System.out.println("max:"+max);
		//求最小值
		int min= getMin(arr);
		System.out.println("min:"+min);
		//求和
		int sum = sum(arr);
//		System.out.println("sum:"+sum);
		//平均值
		int tmp = sum-max-min;
//		System.out.println(tmp);
//		System.out.println(arr.length-2);
		int avg = (sum-max-min)/(arr.length-2);
		System.out.println("该选手最终得分:"+avg);

	}

	public static int sum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
