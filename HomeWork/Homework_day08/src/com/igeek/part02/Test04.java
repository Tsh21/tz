package com.igeek.part02;

import java.util.HashSet;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 *  1.	定义一个Student类,包含名称,年龄,性别重写hashCode()和equals()方法
	2.	创建HashSet集合
	3.	使用Student类创建10个学生,把这10个学生添加到Set集合中
	4.	使用迭代器遍历HashSet
	5.	使用增强for遍历集合

 */
public class Test04 {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(new Student("wb", 20, "男"));
		hashSet.add(new Student("dzy", 10, "男"));
		hashSet.add(new Student("zh", 19, "男"));
		
		for (Student student : hashSet) {
			System.out.println(student);
		}

	}

}
