package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 * 测试字符串 构造方法
 */
public class TestString01 {

	public static void main(String[] args) {
		//直接赋值
		String s1 = "abc";
		System.out.println(s1);

		char data[] = { 'a', 'b', 'c' };
		String str = new String(data);
		System.out.println(str);
		
		String string = new String("hello");
		System.out.println(string);
		
		String s3 = new String(data,1,2);
		System.out.println("s3:"+s3);
		System.out.println("---------");


	}

}
