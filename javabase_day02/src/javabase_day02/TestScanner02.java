package javabase_day02;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年2月28日
 * @version 1.0 @description： 1. 键盘录入两个数据比较是否相等 
 */
public class TestScanner02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();

		System.out.println(a == b);

	}

}
