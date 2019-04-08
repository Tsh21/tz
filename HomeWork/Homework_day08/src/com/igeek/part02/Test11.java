package com.igeek.part02;

import java.util.HashSet;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 */
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student2> hashSet = new HashSet<>();
		hashSet.add(new Student2("wb", 20, 90));
		hashSet.add(new Student2("dzy", 21, 60));
		hashSet.add(new Student2("zh", 20, 80));
		hashSet.add(new Student2("lzx", 19, 70));
		hashSet.add(new Student2("fcy", 22, 50));
		
		//使用迭代器获取一个学生.
		Student2 stu = hashSet.iterator().next();
		
		double totalScore = 0;
		
		double maxScore = stu.getScore();
		double minScore = stu.getScore();
		
		for (Student2 student2 : hashSet) {
			//将学生的分数添加到总分
			totalScore += student2.getScore();
			
			if(maxScore < student2.getScore()) {
				maxScore = student2.getScore();
			} else if(minScore > student2.getScore()) {
				minScore = student2.getScore();
			}
			
		}
		
		double avgScore = totalScore/hashSet.size();
		
		System.out.println("总分"+totalScore);
		System.out.println("最高分"+maxScore);
		System.out.println("最低分"+minScore);
		System.out.println("平均分"+avgScore);
		

	}

}
