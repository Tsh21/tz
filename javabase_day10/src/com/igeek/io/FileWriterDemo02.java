package com.igeek.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @date 2019年3月13日
 * @version 1.0
 * @description：
 * 相对路径：相对当前项目而言的，在项目的根目录下(a.txt)
 * 绝对路径：以盘符开始的路径(d:\\a.txt)
 * 
 * close()和flush()方法的区别：
 * 		flush():刷新缓冲区。流对象还可以继续使用。
 * 		close():先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。

 */
public class FileWriterDemo02 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("a.txt");
		
		fw.write("hellojava");
		fw.flush();
		fw.write("world");
		fw.flush();
		
		fw.close();
		fw.write("test");
		
		
	}
}
