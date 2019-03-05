package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 *  写一个方法，把所有的水仙花数打印在控制台
 * 
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：无参数

 */
public class TestMethod06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFlower();
	}
	
	static void printFlower() {
		for (int i = 100; i < 1000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == i ) {
				System.out.println(i);
			}
		}
	}

}
