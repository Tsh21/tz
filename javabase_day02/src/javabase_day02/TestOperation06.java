package javabase_day02;

/**
 * @author 祝祥
 * @date 2019年2月28日
 * @version 1.0
 * @description：	三元运算符
 * A:格式
	(关系表达式) ? 表达式1 ：表达式2；
	
	如果条件为true，运算后的结果是表达式1；
	如果条件为false，运算后的结果是表达式2；
   B:示例：
	获取两个数中大数。
	int x=3,y=4,z;
	z = (x>y)?x:y;//z变量存储的就是两个数的大数

 */
public class TestOperation06 {

	public static void main(String[] args) {
		int x=5,y=4,z;
		z = (x>y) ? x : y;
		System.out.println(z);
		
		int score = 80;
		String type = score<60 ? "不及格" : "及格";
		System.out.println(type);
		
		if(score<60) {
			System.out.println("不及格");
		}else {
			System.out.println("及格");
		}
		
		//嵌套 
		int x1 = -100;
		System.out.println(x1 > 0 ? 1:(x1 == 0 ? 0:-1));

	}

}
