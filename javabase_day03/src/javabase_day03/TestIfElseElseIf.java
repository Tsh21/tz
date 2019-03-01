package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 *  if(关系表达式1) {
		     语句体1;
	}else  if (关系表达式2) {
			     语句体2;
	}else  if (关系表达式3) {
			     语句体3;
	}else  if (关系表达式4) {
			     语句体4;
	}
	    …
	else {
			     语句体n+1;
	}
	执行流程
	首先判断关系表达式1看其结果是true还是false
	如果是true就执行语句体1
	如果是false就继续判断关系表达式2看其结果是true还是false
	如果是true就执行语句体2
	如果是false就继续判断关系表达式…看其结果是true还是false
	…
	如果没有任何关系表达式为true，就执行语句体n+1

 */
public class TestIfElseElseIf {

	public static void main(String[] args) {
		/*
		 *  随机生成年龄，小于15，儿童；小于30，青年；小于50 中年；小于65 中老年 。。。。
		 */
		int age = (int) (100*Math.random());
		System.out.println(age);
		if(age<15) {
			System.out.println("儿童");
		}
		else if (age <30) {
			System.out.println("青年");
		}
		else if (age <50) {
			System.out.println("中年");
		}
		else if (age <65) {
			System.out.println("中老年年");
		}
		else if (age <85) {
			System.out.println("老年");
		}
		else {
			System.out.println("老寿星");
		}
		

	}

}
