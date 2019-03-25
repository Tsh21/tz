package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description: 
 * try{ 需要检测的异常； } 
 * catch(异常类名异常变量) { 
 * 		异常处理代码 可以调用异常的方法
 *               通常我们只使用一个方法：printStackTrace打印异常信息
 * } 
 * ....... 
 * finally{
 *               此处存放一定要执行的代码 
 *               一般把释放资源的代码放到finally中
 * }
 * 
 */
public class FinallyDemo {

	public static void main(String[] args) {
		// 编译时异常
		// "d:/test.txt"
		// 指定文件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();
		try {
			FileWriter fw = new FileWriter(path);
			fw.write("abc");
			fw.flush();
		} catch (IOException e) {
			System.out.println("产生了IO问题");
		} finally {
			System.out.println("我要关闭资源");
		}

		System.out.println("后边的代码");

	}

}
