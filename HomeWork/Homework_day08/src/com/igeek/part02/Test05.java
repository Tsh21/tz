package com.igeek.part02;

import java.util.ArrayList;
import java.util.HashSet;

public class Test05 {

	public static void main(String[] args) {
		String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
		
		HashSet<String> hashSet = new HashSet<>();
		for (String str : arr) {
			hashSet.add(str);
		}
		
		System.out.println(hashSet);
		
		ArrayList<String> arrayList = new ArrayList<>(hashSet);
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		
		

	}

}
