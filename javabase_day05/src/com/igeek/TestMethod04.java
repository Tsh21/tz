package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0 @description： * 需求：键盘录入三个数据，返回三个数中的最大值
 * 
 *          两个明确： 返回值类型：int 参数列表：int a,int b,int c
 * 
 */
public class TestMethod04 {

	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int b = sc.nextInt();

		System.out.println("请输入第三个数据：");
		int c = sc.nextInt();
		
		//调用方法
		int max = getMax(a, b, c);
		System.out.println(max);

	}

	static int getMax(int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

}
