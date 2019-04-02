package com.igeek;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection02 {

	public static void main(String[] args) {
		Collection<String> l1 = new ArrayList<>();
		
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		
		Collection<String> l2 = new ArrayList<>();
		l2.add("aa");
		l2.add("bb");
//		l2.add("ee");
		
		System.out.println("l1:"+l1);
		
		// 将指定 collection 中的所有元素都添加到此 collection 中
//		l1.addAll(l2);
		// 移除此 collection 中那些也包含在指定 collection 中的所有元素
//		l1.removeAll(l2);
		// 仅保留此 collection 中那些也包含在指定 collection 的元素
		l1.retainAll(l2);
		
		System.out.println("l1:"+l1);
		
		//如果此 collection 包含指定 collection 中的所有元素，则返回 true
		System.out.println(l1.containsAll(l2));
		
		
	}

}
