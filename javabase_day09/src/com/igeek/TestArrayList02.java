package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * 获取元素
 * 		public E get(int index):返回指定索引处的元素
 * 集合长度
 * 		public int size():返回集合中的元素的个数
 * 删除元素
 * 		public boolean remove(Object o):删除指定的元素，返回删除是否成功
 * 		public E remove(int index):删除指定索引处的元素，返回被删除的元素
 * 修改元素
 * 		public E set(int index,E element):修改指定索引处的元素，返回被修改的元素

 */
public class TestArrayList02 {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
				
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("Android");
		
		//获取元素
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		
		//返回集合中的元素的个数
		System.out.println(array.size());
		
//		System.out.println(array.remove("world"));
//		System.out.println(array.remove("world"));
		
//		System.out.println(array.remove(0));
		//修改指定索引处的元素，返回被修改的元素
		array.set(2, "IOS");
		
		System.out.println(array);
		
		


	}

}
