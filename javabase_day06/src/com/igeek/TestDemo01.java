package com.igeek;

/**
 * @author zx
 * @date 2019年3月6日
 * @version 1.0
 * @description：
  *  需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。

 */
public class TestDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10000; i < 1000000; i++) {
			int ge = i%10;
			int shi = i/10%10;
//			int bai = i/10/10%10;
			int qian = i/10/10/10%10;
			int wan = i/10/10/10/10%10;
			
			//个位与万位相同，十位与千位相同
			if((ge == wan) && (shi == qian)) {
				System.out.println(i);
			}
		}

	}

}
