package com.igeek.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 把ArrayList集合中的字符串数据存储到文本文件
 * 每一个字符串元素作为文件中的一行数据
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:往集合中添加字符串元素
 * 		C:创建输出缓冲流对象
 * 		D:遍历集合，得到每一个字符串元素，然后把该字符串元素作为数据写到文本文件
 * 		E:释放资源
 */
public class ArrayListToFileTest {

	public static void main(String[] args) throws IOException {
		//创建集合对象
		ArrayList<String> arrayList = new ArrayList<String>();
		//往集合中添加字符串元素
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\array.txt"));
		//读写数据
		for (int i = 0; i < arrayList.size(); i++) {
			String s = arrayList.get(i);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();

	}

}
