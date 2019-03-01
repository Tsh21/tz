package javabase_day03;

/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：while循环
 * 
 * 基本格式
   while(判断条件语句) {
          循环体语句;
   }
	扩展格式
	
	   初始化语句;
	   while(判断条件语句) {
	         循环体语句;
	         控制条件语句;
	}
	
    需求：1+2+3+4+...+100=5050;
 */
public class TestWhile {

	public static void main(String[] args) {
		//初始化语句
		int i=1;
		int sum=0;
		while(i<=100) {
			sum =sum+i;
			//控制条件语句;
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println(i);
	}

}
