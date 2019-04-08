package com.igeek.part02;

import java.util.ArrayList;
import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a");
		arr.add("f");
		arr.add("b");
		arr.add("c");
		arr.add("a");
		arr.add("d");
		System.out.println(arr);
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.addAll(arr);
		
		System.out.println(hashSet);
		
		hashSet.clear();
		
		System.out.println(hashSet);
		

	}

}
