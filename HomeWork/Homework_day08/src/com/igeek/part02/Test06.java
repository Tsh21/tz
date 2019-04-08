package com.igeek.part02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.SpringLayout.Constraints;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * ArrayList集合有以下元素:{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明","张柏芝","刘德华"}.
 * 1.使用HashSet将重复的元素去除.
 * 2.编写一个方法:将去重后的人员写入到D:\\a.txt中.
 * 3.编写一个方法:将D:\\a.txt中所有姓张的人员信息读取出来并打印到控制台上
 */
public class Test06 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("张柏芝");
		arr.add("刘德华");
		arr.add("张亮");
		arr.add("张靓颖");
		arr.add("杨颖");
		arr.add("黄晓明");
		arr.add("张柏芝");
		arr.add("刘张华");
		
		HashSet<String> hashSet = new HashSet<>(arr);
		
//		save(hashSet);
		
		read();
		

	}

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
		String name = null;
		while((name = br.readLine()) != null) {
			//判断姓张的人员信息
			//contains();
			if(name.startsWith("张")) {
				System.out.println(name);
			}
		}
		br.close();
	}

	public static void save(HashSet<String> hashSet) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
		
		for(String name : hashSet) {
			bw.write(name);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		
	}

}
