package com.igeek.exe03;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("cwj", 18, 90));
		students.add(new Student("wb", 20, 92));
		students.add(new Student("lzx", 19, 99));
		students.add(new Student("dzy", 18, 90));
		students.add(new Student("zh", 21, 60));
		
		//取出迭代器
		Iterator<Student> iterator = students.iterator();
		
		//定义总分
		double totalScore = 0;
		//定义最高分
		double maxScore = students.get(0).getScore();
		//定义最低分
		double minScore = students.get(0).getScore();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			
			totalScore += student.getScore();
			
			if(maxScore < student.getScore()) {
				maxScore = student.getScore();
			}
			
			if(minScore > student.getScore()) {
				minScore = student.getScore();
			}
		}
		
		double avgScore = totalScore/students.size();
		
		System.out.println("最高分："+maxScore+";最低分："+minScore+";平均分"+avgScore);

	}

}
