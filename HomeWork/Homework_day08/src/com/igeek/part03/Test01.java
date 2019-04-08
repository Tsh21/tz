package com.igeek.part03;

import java.util.HashSet;
import java.util.Random;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 双色球规则:双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择.请随机生成一注双色球号码
 */
public class Test01 {

	public static void main(String[] args) {
		Random aRandom = new Random();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		while(hashSet.size() < 6) {
			int num = aRandom.nextInt(33)+1;
			hashSet.add(num);
		}
		
		int blueBall = aRandom.nextInt(16)+1;
		
		System.out.println("双色球号码:");
		System.out.print("红色球：");
		for (Integer integer : hashSet) {
			System.out.print(integer+ " ");
		}
		
		System.out.println();
		System.out.println("蓝色球："+blueBall);
		

	}

}
