package com.igeek.part03;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 
 * 有一堆零件数量不超过1000个,
 * 如果4个零件一组最后剩余2个,
 * 如果7个零件一组最后剩余3个,
 * 如果9个零件一组最后剩余5个,
 * 请计算这堆零件个数有几种可能
 */
public class Test03 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 6; i< 100; i++) {
			if((i%4 == 2) || (i%7 == 3) || (i%9 == 5)) {
				count++;
			}
		}
		
		System.out.println("共有："+count+"种情况。");

	}

}
