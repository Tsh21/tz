package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;

/**
   *      迭代器的使用
 * @author zx
 * @date 2019年3月29日
 * @version 1.0
 * @description:
  * 在java当中不止ArrayList一个集合,java提供了众多的集合.
 *  
*  不同的容器完成不同方式的数据存储.
*  不同集合的特点不同,ArrayList有序且可重复且带索引的集合.但是有的集合不带索引.所以如果使用其他集合,可能无法通过get+索引的方式获取元素
*  
*  所有集合的通用获取元素方法并不是通过索引获取,而是通过迭代器获取.
*  迭代器:iterator

 */
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//添加元素
		list.add(10);
		list.add(100);
		list.add(2000);
		
		//获取该集合的迭代器
		Iterator<Integer> iterator = list.iterator();
		
		//hasNext()用来判断集合中是否有下一个元素可以迭代
		while(iterator.hasNext()) {
			//next()用来返回迭代的下一个元素，并把指针向后移动一位
			Integer i = iterator.next();
			System.out.println(i);
		}
	}

}
