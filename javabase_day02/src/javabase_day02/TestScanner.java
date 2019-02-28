package javabase_day02;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年2月28日
 * @version 1.0
 * @description：键盘录入
 * A:导包(位置放到class定义的上面)
	import java.util.Scanner;
   B:创建对象
	Scanner sc = new Scanner(System.in);
   C:接收数据
	int x = sc.nextInt();

 */
public class TestScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x);
	}

}
