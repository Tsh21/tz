package javabase_day02;

import java.util.Scanner;

/**
 * @author 祝祥
 * @date 2019年2月28日
 * @version 1.0
 * @description：2. 键盘录入三个数据，获取这三个数据中的最大值
 */
public class TestScanner03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();
		System.out.println("请输入第三个数：");
		int c = scanner.nextInt();
		
//		int temp = a>b ? a:b;
//		int max = temp>c ? temp : c;
//		System.out.println("max="+max);
		
		System.out.println((a>b ? a:b)>c ? (a>b ? a:b ): c);

	}

}
