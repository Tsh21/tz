package com.igeek;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayList<E> {
	
	private Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public CopyArrayList() {
		super();
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public CopyArrayList(int initialCapacity) {
		super();
		if(initialCapacity >0) {
			elementData = new Object[initialCapacity];
		}
		else if(initialCapacity <=0) {
			throw new IllegalArgumentException("Illegal Capacity");
		}
	}
	
	//添加
	public void add(E e) {
//		elementData[size] = e;
//		size = size +1;
		
		//什么时候扩容？
		if(size == elementData.length) {
			//扩容
//			int oldCapacity = elementData.length;
//	        int newCapacity = oldCapacity + (oldCapacity >> 1);
//	        Object[] newArray = new Object[newCapacity];
			Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
	        //拷贝
	        System.arraycopy(elementData, 0, newArray, 0, elementData.length);
	        elementData = newArray;
		}
		elementData[size++] = e;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		//[hello,java]
		sb.append("[");
		for(int i = 0; i < size ; i++) {
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}

	public static void main(String[] args) {
		CopyArrayList<String> arrayList = new CopyArrayList<String>();
//		arrayList.add("hello");
//		arrayList.add("java");
//		arrayList.add(666);
//		arrayList.add(888);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
		for(int i=0;i<40;i++) {
			arrayList.add(i+"");
		}
		
		System.out.println(arrayList);
		
        
	}
	
	

}
