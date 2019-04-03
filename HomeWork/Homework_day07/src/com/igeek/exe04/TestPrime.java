package com.igeek.exe04;

/**
 * @author zx
 * @date 2019年4月3日
 * @version 1.0
 * @description:
 *    统计101-200之间有多少个素数，并输出所有素数。
 *   素数又叫质数，一个大于1的自然数，就是除了1和它本身之外，再也没有整数能被它整除的数。
 *   3 2 
 *   4 2 3 
 *   5 2 3 4 
 *   6 2 3 4 5
 *   7 2 3 4 5 6
 *   
 *   i = 101  1 和 101
 *   
 *   解2：
 *   i是偶数，跳过
 *   解3：
 *   sqrt(i)
 */
public class TestPrime {

	public static void main(String[] args) {
		for(int i= 101 ;i<=200;i++) {
			//j [2,100]
			boolean flag = false;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.print(i+" ");
			}
			
		}

	}

}
