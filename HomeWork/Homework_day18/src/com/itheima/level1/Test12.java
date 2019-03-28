package com.itheima.level1;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月28日
 * @version 1.0
 * @description:
   *        编写一个校验用户名的程序,检测键盘录入的用户名是否合法
	 要求:必须以英文开头,只能包含英文,数字和`_`;最少6位,最多12位

 */
public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请用户输入登录名：");
		String username = sc.nextLine();
		
		if(username.matches("[a-zA-Z]\\w{5,11}")) {
			System.out.println("登录成功");
		}else {
			System.out.println("失败");
		}
		

	}

}
