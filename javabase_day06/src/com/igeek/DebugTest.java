package com.igeek;

public class DebugTest {

	public static void main(String[] args) {
		// 定义求和变量
		int sum = 0;

		// 循环获取每一个数据
		for (int x = 1; x <= 5; x++) {
			sum += x;
		}

		System.out.println("sum:" + sum);

	}

}
