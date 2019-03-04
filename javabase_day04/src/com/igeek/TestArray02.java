package com.igeek;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0
 * @description：需求：数组遍历(依次输出数组中的每一个元素)
 */
public class TestArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = {1,2,3};
//		for(int i=0;i<3;i++) {
//			System.out.print(arr1[i]+" ");
//		}
		
		int[] arr = new int[10];
		//赋值1~10
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		//遍历数组
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
	}

}
