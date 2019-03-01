package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 * for(初始化语句;判断条件语句;控制条件语句) {
              循环体语句;
	}
	//初始化语句
		int i=1;
		int sum=0;
		while(i<=100) {
			sum =sum+i;
			//控制条件语句;
			i++;
	}
	
	A:执行初始化语句
	B:执行判断条件语句，看其结果是true还是false
	如果是false，循环结束。
	如果是true，继续执行。
	C:执行循环体语句
	D:执行控制条件语句
	E:回到B继续


 */
public class TestFor {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			sum = sum +i;
		}
		
		System.out.println(sum);

	}

}
