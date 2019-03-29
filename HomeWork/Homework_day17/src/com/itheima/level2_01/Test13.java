package com.itheima.level2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//文本的复制
public class Test13 {

	public static void main(String[] args) {
		copyFile("context.txt", "12.txt");
	}
	
	public static void copyFile(String src,String dest) {
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dest));
			
			char[] chs = new char[1024];
			
			int len;
			while((len = br.read(chs)) != -1) {
				bw.write(chs,0,len);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
		}
	}

}
