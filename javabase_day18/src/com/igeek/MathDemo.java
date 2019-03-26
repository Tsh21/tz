package com.igeek;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
 * Math:数学工具类
 */
public class MathDemo {

	public static void main(String[] args) {
		//访问静态常量
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//访问静态方法
		//Math.abs求绝对值
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		//向上取整
		System.out.println(Math.ceil(1.26));
		//向下取整
		System.out.println(Math.floor(1.26));
		//四舍五入
		System.out.println(Math.round(1.56));
		//返回第一个参数的第二个参数次幂的值
		System.out.println(Math.pow(2, 10));
		
	}

}
