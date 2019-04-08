package com.igeek.part02;

import java.util.LinkedList;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
	1.	定义QQ号码数组String[] strs
	2.	创建LinkedList
	3.	遍历strs获取每个qq号码
	4.	判断LinkedList是否已经存在这个qq号码
	5.	不存在这个qq号码则添加到LinkedList中
	6.	增强for遍历LinkedList
	7.	迭代器遍历LinkedList

 */
public class Test03 {

	public static void main(String[] args) {
		String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
		
		LinkedList<String> qq = new LinkedList<>();
		
		//遍历strs获取每个qq号码
		for(String str : strs) {
			if(!qq.contains(str)) {
				qq.add(str);
			}
		}
		
		for (String string : qq) {
			System.out.println(string);
		}
		

	}

}
