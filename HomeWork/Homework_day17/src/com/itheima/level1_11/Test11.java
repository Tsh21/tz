package com.itheima.level1_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test11 {

	public static void main(String[] args) {
		write("study java hi");
	}
	
	public static void write(String content) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("context.txt"));
			bw.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) {
					bw.close();
					bw = null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
