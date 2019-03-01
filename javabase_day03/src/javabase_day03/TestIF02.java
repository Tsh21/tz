package javabase_day03;
/**
 * @author zx
 * @date 2019年3月1日
 * @version 1.0
 * @description：
 */
public class TestIF02 {

	public static void main(String[] args) {
		//通过Math.random()产生随机数
		double d = Math.random();//返回【0,1）
		System.out.println(d);
		
		int h = (int) (6*(Math.random())+1);
		System.out.println(h);
		if(h<3) {
			System.out.println("小");
		}
		
		/*
		 * 掷三个骰子，若三个骰子之和大于15输出手气不错；三个骰子之和在10到15之间，输出手气一般；小于10 手气不怎么样
		 */
		int a = (int) (6*(Math.random())+1);
		int b = (int) (6*(Math.random())+1);
		int c = (int) (6*(Math.random())+1);
		//骰子之和
		int sum = a+b+c;
		System.out.println("sum="+sum);
		if(sum >15) {
			System.out.println("手气不错");
		}
		if(sum >=10 && sum <=15) {//   10<=sum<=15
			System.out.println("手气一般");
		}
		if(sum <10) {
			System.out.println("手气不怎么样");
		}

	}

}
