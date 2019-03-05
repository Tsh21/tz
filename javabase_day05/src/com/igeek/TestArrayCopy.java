package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 测试数组的拷贝
 */
public class TestArrayCopy {

	public static void main(String[] args) {
		String[] s1 = {"aa","bb","cc","dd","ee"};
		String[] s2 = new String[10];
		
		System.arraycopy(s1, 2, s2, 6, 3);
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		System.out.println("###########");
		testCopy();

	}
	
	//从数组中删除某个元素（删掉cc）
	public static void testCopy() {
		String[] s1 = {"aa","bb","cc","dd","ee"};
		System.arraycopy(s1, 3, s1, 2, 2);
		s1[s1.length-1]=null;
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
	}

}
