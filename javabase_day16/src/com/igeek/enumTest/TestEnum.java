package com.igeek.enumTest;

/**
 * @author zx
 * @date 2019年3月22日
 * @version 1.0 @description：
 * 
 * JDK1.5引入了枚举类型 enum 枚举名 { 枚举体（常量列表） }
 * 
 * 
 */
public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);

		Season a = Season.SPRING;

		switch (a) {
		case SPRING:
			System.out.println("春天来了");
			break;
		case SUMMER:
			System.out.println("夏天来了");
			break;
		case AUTUMN:
			System.out.println("秋天来了");
			break;
		case WINTER:
			System.out.println("冬天来了");
			break;
		}
	}
}

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER
}

