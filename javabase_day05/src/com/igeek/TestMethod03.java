package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 需求：键盘录入两个数据，比较两个数是否相等
 * 
 * 两个明确：
 * 		返回值类型：boolean
 * 		参数列表：int a,int b

 */
public class TestMethod03 {
	
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();
		
		boolean flag = compare(x, y);
		System.out.println(flag);
		
	}
	
	static boolean compare(int a,int b){
		if(a==b) {
			return true;
		}else {
			return false;
		}
	}

}
