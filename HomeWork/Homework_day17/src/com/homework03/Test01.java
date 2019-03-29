package com.homework03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("张三丰");
		arrayList.add("景甜");
		arrayList.add("林思意");
		arrayList.add("鹿晗");
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("names.txt"));
			
			for(int i=0;i<arrayList.size();i++) {
				String name = arrayList.get(i);
				bw.write(name);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw!= null) {
					bw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
