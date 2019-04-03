package com.igeek.exe02;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年4月2日
 * @version 1.0
 * @description:
 *  1.	定义deleteElements(ArrayList<?> array)方法
	2.	在deleteElements方法中删除第一个元素
	3.	删除最后一个元素
	4.	创建ArrayList
	5.	往ArrayList添加元素
	6.	调用deleteElements方法传入array
	7.	打印array

 */
public class Test10 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("zs");
		arrayList.add("ls");
		arrayList.add("wr");
		arrayList.add("mz");
		
		deleteElements(arrayList);
		
		System.out.println(arrayList);

	}
	
	public static void deleteElements(ArrayList<?> array){
		array.remove(0);
		array.remove(array.size()-1);
	}

}
