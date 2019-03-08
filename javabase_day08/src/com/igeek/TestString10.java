package com.igeek;

/**
 * @author zx
 * @date 2019年3月8日
 * @version 1.0
 * @description：
	 * 举例：int[] arr = {1,2,3};	
	*  输出结果：[1, 2, 3]
	* 
	*  分析：
	* 		A:定义一个int类型的数组
	* 		B:写方法实现把数组中的元素按照指定的格式拼接成一个字符串
	* 		C:调用方法
	* 		D:输出结果
*/

public class TestString10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		TestString10 string10 = new TestString10();
		
		String s= string10.arrayToString(arr);
		
		System.out.println(s);

	}

	public String arrayToString(int[] arr) {
		String s="[";
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				s +=arr[i];
			}else {
				s+= arr[i];
				s+=",";
			}
			
		}
		s+="]";
		return s;
	}

}
