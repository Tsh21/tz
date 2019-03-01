package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 *  if(关系表达式) {
		     语句体1;
	}else {
		语句体2;
	}
	执行流程
	首先判断关系表达式看其结果是true还是false
	如果是true就执行语句体1
	如果是false就执行语句体2

 */
public class TestIfElse {

	public static void main(String[] args) {
		// 判断给定的数据是奇数还是偶数
		int a = 100;
		// 给a重新赋值
		a = 99;

		if (a % 2 == 0) {
			System.out.println("a是偶数");
		} else {
			System.out.println("a是奇数");
		}
		
		/*
		 * 根据随机数生成[0，4）的圆的半径，求圆的面积和周长；
		 * 比较面积和周长，若面积>=周长，输出面积大于等于周长；否则输出面积小于周长
		 */
		//半径
		double radius = 4*Math.random();
		//求面积
//		double area = 3.14*radius*radius;
		//Math.pow(radius, 2)等价redius*radius
		double area = Math.PI*Math.pow(radius, 2);
		//周长
		double perimeter = 2*Math.PI*radius;
		System.out.println("radius="+radius);
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);
		
		if(area>=perimeter) {
			System.out.println("面积大于等于周长");
		}else {
			System.out.println("面积小于周长");
		}
		

	}

}
