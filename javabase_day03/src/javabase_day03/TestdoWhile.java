package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：do…while循环
 * 基本格式
   do {
         循环体语句;
   }while(判断条件语句);
   
	扩展格式
	   初始化语句;
	   do {
	         循环体语句;
	         控制条件语句;
	} while(判断条件语句);
	
	do…while循环至少会执行一次循环体。

 */
public class TestdoWhile {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		//先执行，再判断
		do {
			sum += i;//sum = sum+i
			i++;
		} while (i <=100);
		System.out.println(sum);
		
		System.out.println("############");
		//初始化语句
		int i1=1;
		int sum1=0;
		//先判断，再执行
		while(i1<=100) {
			sum1 =sum1+i1;
			//控制条件语句;
			i1++;
		}
		System.out.println("sum="+sum1);

	}

}
