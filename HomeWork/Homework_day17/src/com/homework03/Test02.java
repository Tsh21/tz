package com.homework03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("names.txt"));
			
			String line;
			while((line = br.readLine())!= null) {
				arrayList.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		for (String string : arrayList) {
			System.out.println(string);
		}
	}

}
