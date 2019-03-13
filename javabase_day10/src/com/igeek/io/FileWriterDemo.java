package com.igeek.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * FileWriter输出流
 */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建FileWriter对象(输出流)
		FileWriter fw = new FileWriter("d:\\a.txt");
		fw.write("hellojava");
		//数据没有直接写到文件，其实是写到了内存的缓冲区
		fw.flush();
		//释放资源
		fw.close();
	}

}
