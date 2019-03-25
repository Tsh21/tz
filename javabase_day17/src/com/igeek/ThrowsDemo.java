package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description:
 * 
 * 				在某个方法的声明上,让它(这个方法)抛出这个产生的异常,自己不处理,谁调用这个方法,谁处理 方法声明上加 throws
 *               异常类名
 * 
 *               如: 方法a中产生了异常,声明抛出 方法b调用方法a,则该异常由a转向了b
 * 
 *               一般情况下,main方法是不会声明抛出异常的,因为该方法抛出,直接抛出给了JVM,JVM的默认处理机制是终止程序运行,则这样处理,相当于没有处理!
 * 
 *               修饰符 返回值类型 方法名(参数类型参数名1,参数类型参数名2...) throws 异常类名 {
 * 
 *               }
 * 
 * 
 */
public class ThrowsDemo {

	public static void main(String[] args) {
		//Unhandled exception type IOException
		try {
			method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}
	
	public static void method() throws IOException {
		//Unhandled exception type IOException
		method2();
	}

	public static void method2() throws IOException {
		// 编译时异常
		// "d:/test.txt"
		// 指定文件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();
		
		//Unhandled exception type IOException
		FileWriter fw = new FileWriter(path);
		System.out.println("输出成功了");

	}

}
