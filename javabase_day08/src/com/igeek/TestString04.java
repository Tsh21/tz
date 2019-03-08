package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
 * 需求:模拟登录,给三次机会,并提示还有几次
 * 
 * 分析：
* 		A:定义两个字符串对象，用于存储已经存在的用户名和密码
* 		B:键盘录入用户名和密码
* 		C:拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
* 			如果内容相同，提示登录成功
* 			如果内容不同，提示登录失败，并提示还有几次机会

 */
public class TestString04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "bob";
		String password = "bob";
		
		//给三次机会
		for (int i = 0; i < 3; i++) {
			//键盘录入用户名和密码
			Scanner scanner = new Scanner(System.in);
			System.out.println("请用户输入用户名：");
			String name = scanner.nextLine();
			System.out.println("请用户输入密码：");
			String number = scanner.nextLine();
			
			//拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
			if(username.equals(name) && password.equals(number)) {
				System.out.println("登录成功！");
				break;
			}else {
				if(i == 2) {
					System.out.println("您的账户已被冻结。。。。");
				}else {
					System.out.println("登录失败，还有"+(2-i)+"次机会！");
				}
			}
		}

	}

}
