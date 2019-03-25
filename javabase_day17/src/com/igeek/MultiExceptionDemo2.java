package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description:
 */
public class MultiExceptionDemo2 {

	public static void main(String[] args) {
		
		//多个异常一次try一次catch
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		
		try {
			FileWriter fw = new FileWriter(path);
			System.out.println(10/0);
		}catch(ArithmeticException | IOException ae) {
			System.out.println("您访问的文件不存在!或者除数不能为0");
		}
		System.out.println("后边的代码");
		
		//多个异常分别处理
		/*Scanner sc = new Scanner(System.in);
		String path = sc.next();
		
		try {
			FileWriter fw = new FileWriter(path);
		} catch (IOException e) {
			System.out.println("您访问的文件不存在!");
		}
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}*/

		
		// 一个try多个catch的方式
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();
		try {
			FileWriter fw = new FileWriter(path);
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("您的除数不能为0");
		} catch (IOException e) {
			System.out.println("您要访问的文件不存在");
		}

		System.out.println("后边的代码");*/

	}

}
