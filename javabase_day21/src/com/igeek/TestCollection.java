package com.igeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author zx
 * @date 2019年4月2日
 * @version 1.0
 * @description:
 * Collection：所有单列集合的直接或间接接口，其指定了所有集合应该具备的基本功能。
   *   测试 Collection接口中的方法
 */
public class TestCollection {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.add("万晨阳");
		c.add("范旭东");
		
		System.out.println(c);
		System.out.println(c.size());
		
		System.out.println(c.contains("万晨阳"));
		
		Object[] objects = c.toArray();
		System.out.println(Arrays.toString(objects));
		
		c.remove("范旭东");
		System.out.println(c);
		
		c.clear();
		System.out.println(c);
		System.out.println(c.size());

	}

}
