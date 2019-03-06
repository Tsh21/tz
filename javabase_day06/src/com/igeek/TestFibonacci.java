package com.igeek;

/**
 * @author zx
 * @date 2019年3月6日
 * @version 1.0
 * @description：
  *  需求：
 * 		有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 		假如兔子都不死，问第二十个月的兔子对数为多少？ 
 * 
  * 第一个月：1
 *  第二个月：1
 *  第三个月：1  1 = 2
 *  第四个月：1  1  1 = 3
 *  第五个月：1  1  1  1  1= 5
 *  ......
 *  
 *  规律：从第三个月开始，每个月的兔子是前两个月的兔子数之和
 */
public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20代表数组的长度
		int[] arr = new int[20];
		
		//初始化第一个月与和第二个月的兔子数
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		System.out.println(arr[19]);
		System.out.println(arr[arr.length-1]);
		
//		System.out.println(fab(20));
		
		System.out.println(fibonacci(20));
		

	}
	
	//递归
	public static int fab(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return fab(n-1) + fab(n-2);
		}
	}
	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
