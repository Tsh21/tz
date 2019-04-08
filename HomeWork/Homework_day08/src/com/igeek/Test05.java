package com.igeek;

import java.util.HashSet;
import java.util.Iterator;

//不重复，无序
public class Test05 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("zhangsan");
		hashSet.add("lisi");
		hashSet.add("wangwu");
		hashSet.add("zhangsanzz");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
