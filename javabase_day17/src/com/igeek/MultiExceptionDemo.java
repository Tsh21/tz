package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description: 多异常处理一: 声明抛出处理,直接抛出多个异常即可
 * 
 *               多异常处理二: 一个try多个catch的方式
 * 
 *               java是中断异常的处理方式
 * 
 */
public class MultiExceptionDemo {
	
	public static void main(String[] args) {
		try {
			method();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello.....");
	}

	public static void method() throws ArithmeticException, IOException {

		System.out.println(10 / 1);
		System.out.println("method逻辑1完成");

		method2();
		System.out.println("method逻辑2完成");
	}

	/**
	 * @Title: method2
	 * @Description: 抛出异常的方法2
	 * @throws IOException
	 */
	public static void method2() throws IOException {
		// 指定文件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();

		FileWriter fw = new FileWriter(path);
	}

}
