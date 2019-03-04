package com.igeek;

import java.util.Random;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0
 * @description：需求：如何获取到一个1-100之间的伪随机数
 */
public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();//[0,1)
		int i = random.nextInt(100)+1;
		System.out.println(i);
		

	}

}
