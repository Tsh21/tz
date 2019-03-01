package javabase_day03;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 * switch语句格式：
 	switch(表达式) {
		case 值1 :
 	 			语句体1;
 	 			break;
 		case 值2 :
				语句体2;
 				break;
 		...
 		default:
			语句体n+1;
 			break;
 	}
 	
 	首先计算出表达式的值
	其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。
	最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。
	
	break表示中断，结束的意思，可以结束switch语句

 */
public class TestSwitch {

	public static void main(String[] args) {
		// 根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1~7的数字：");
		int num = scanner.nextInt();
		
		//break 跳出
		switch(num) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
//		default:
//			System.out.println("你输入的数字有误");
//			break;
		}

		
		
		
	}

}
