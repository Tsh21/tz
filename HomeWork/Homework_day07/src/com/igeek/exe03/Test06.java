package com.igeek.exe03;

public class Test06 {

	public static void main(String[] args) {
		Integer[] s1 = {1,2,3,4,5,6};
		System.out.println(printArr(s1));
	}

	// 泛形方法
	public static <T> String printArr(T[] arr) {
		StringBuilder sb = new StringBuilder();
		
		//[hello,java]
		sb.append("[");
		for(int i = 0; i < arr.length ; i++) {
			sb.append(arr[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}

}
