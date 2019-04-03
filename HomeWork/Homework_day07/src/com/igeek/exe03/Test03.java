package com.igeek.exe03;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("a");
		
		System.out.println(frequency(list, "c"));

	}
	
	public static int frequency(List<String> arr, String key){
		int count = 0;
		for (String object : arr) {
			if(object.equals(key)) {
				count++;
			}
		}
		return count;
	}

}
