package com.igeek.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 从文本文件中读取数据到ArrayList集合中，并遍历集合
 * 每一行数据作为一个字符串元素
 * 
 * 分析：
 * 		A:创建输入缓冲流对象
 * 		B:创建集合对象
 * 		C:读取数据，每次读取一行数据，把该行数据作为一个元素存储到集合中
 * 		D:释放资源
 * 		E:遍历集合
 */
public class FileToArrayListTest {

	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("d:\\array.txt"));
		//创建集合对象
		ArrayList<String> arrayList = new ArrayList<String>();
		//读取数据
		String line;
		while((line = br.readLine()) != null) {
			arrayList.add(line);
		}
		//释放资源
		br.close();
		//遍历集合
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		

	}

}
