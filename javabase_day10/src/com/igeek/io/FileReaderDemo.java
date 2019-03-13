package com.igeek.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * FileReader 输入流
 */
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建FileReader对象
		FileReader reader = new FileReader("d:\\FileReaderDemo.java");
		//读一个字符
//		int ch = reader.read();
//		System.out.println((char)ch);
//		
//		ch = reader.read();
//		System.out.println((char)ch);
//		
//		ch = reader.read();
//		System.out.println((char)ch);
//		
//		ch = reader.read();
//		System.out.println((char)ch);
//		
//		ch = reader.read();
//		System.out.println((char)ch);
		
		//查官方文档，如果读取数据的返回值是-1的时候，就说明没有数据了，这也是我们循环的结束条件
		int ch;
		while((ch = reader.read()) != -1) {
			System.out.print((char)ch);
		}
		//释放资源
		reader.close();
	}

}
