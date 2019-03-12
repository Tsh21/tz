package com.igeek;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * 记事本
 */
public class Notebook {
	
	ArrayList<String> arrList = new ArrayList<String>();
	
	public void add(String note){
		arrList.add(note);
	}
	
	public String getNote(int index) {
		return arrList.get(index);
	}
	public int getSize() {
		return arrList.size();
	}
	
	public void remove(int index) {
		arrList.remove(index);
	}
	
	public String[] list() {
		String[] strings = new String[arrList.size()];
		
//		for (int i = 0; i < arrList.size(); i++) {
//			strings[i] = arrList.get(i);
//		}
		return arrList.toArray(strings);
	}
	
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		notebook.add("first");
		notebook.add("second");
		notebook.add("third");
		
		String temp = notebook.getNote(0);
		System.out.println(temp);
		System.out.println(notebook.getSize());
		
		notebook.remove(0);
		System.out.println(notebook.arrList);
		
		String[] strings = notebook.list();
		
		System.out.println(notebook);
	}

}
