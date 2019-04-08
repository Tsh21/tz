package com.igeek.part02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。使用迭代器把最终的结果输出到控制台。
 */
public class Test07 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();
		
		Random random = new Random();
		
		while(hashSet.size() <10) {
			int num = random.nextInt(20)+1;
			hashSet.add(num);
		}
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
