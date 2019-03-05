package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 需求：写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值。
 * 
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：int n

 */
public class TestMethod05 {

	public static void main(String[] args) {
		print(10);
		System.out.println();
		System.out.println("###############");
		print(3);

	}
	
	static void print(int n){
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
	

}
