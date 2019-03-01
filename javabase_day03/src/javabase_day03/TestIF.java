package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 * if(关系表达式) {
		     语句体
	}
	执行流程:
	首先判断关系表达式看其结果是true还是false
	如果是true就执行语句体
	如果是false就不执行语句体
	
	中文：如果....那么......
 */
public class TestIF {

	public static void main(String[] args) {
		System.out.println("开始");
		// 定义两个变量
		int a = 10;
		int b = 20;

		if (a == b) {
			System.out.println("a等于b");
		}

		int c = 10;
		if (a == c) {
			System.out.println("a等于c");
		}

		System.out.println("结束");


	}

}
