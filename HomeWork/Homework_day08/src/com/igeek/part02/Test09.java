package com.igeek.part02;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 编写一个程序，键盘录入多个数字,直到录入-1结束.将录入的重复数据去除,计算这些不重复数据的总和和平均值
 */
public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		while(true) {
			System.out.println("请用户输入一个数字:");
			int num = sc.nextInt();
			
			if(num == -1) {
				break;
			}
			
			hashSet.add(num);
		}
		
		//定义求和变量
		int sum = 0;
		
		for (Integer integer : hashSet) {
			sum += integer;
		}
		
		System.out.println("总和："+sum);
		System.out.println("平均值："+sum/hashSet.size());
		
	}

}
