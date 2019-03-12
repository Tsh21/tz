package com.igeek;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * 创建一个学生数组，存储三个学生对象并遍历
 * 引用类型的数据默认值为null
 */
public class TestObjectArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		//int类型的数组
		int[] arr2 = new int[5];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		arr2[3]=4;
		arr2[4]=5;
		
		//创建对象数组
		Student[] stus = new Student[3];
		
		Student wangbo = new Student(1, "王博", 20);
		Student wancy = new Student(2, "万晨阳", 20);
		Student daizy = new Student(3, "戴宗一", 20);
		
		stus[0] = wangbo;
		stus[1] = wancy;
		stus[2] = daizy;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("################");
		for (int i = 0; i < stus.length; i++) {
			Student student = stus[i];
			System.out.println(student.getName()+";"+student.getAge());
		}
		
		/*
		 * System.out.println(stus[3]);
		 */		

	}

}
