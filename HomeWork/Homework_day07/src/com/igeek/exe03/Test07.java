package com.igeek.exe03;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年4月2日
 * @version 1.0
 * @description:
 * 1.	创建数组String arr[] = {"abc","bad","abc","aab","bad","cef","jhi"};
	2.	创建ArrayList集合
	3.	使用增强for遍历数组.拿到数组中的每个元素
	4.	使用ArrayList的contains(Object 0)方法判断ArrayList中是否包含某个元素
	5.	如果ArrayList中没有这个元素才添加往数组中添加

 */
public class Test07 {

	public static void main(String[] args) {
		String arr[] = {"abc","bad","abc","aab","bad","cef","jhi"};
		ArrayList<String> arrayList = new ArrayList<>();
		for (String string : arr) {
			//去重复
			if(!arrayList.contains(string)) {
				arrayList.add(string);
			}
		}
		System.out.println(arrayList);
		arrayList.add("abc");
		System.out.println(arrayList);

	}

}
