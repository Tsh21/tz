package com.igeek;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test08 {

	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		
		hashSet.add("王昭君");
		hashSet.add("王昭君");
		hashSet.add("西施");
		hashSet.add("杨玉环");
		hashSet.add("貂蝉");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("########");
		
		for(String str : hashSet) {
			System.out.println(str);
		}

	}

}
