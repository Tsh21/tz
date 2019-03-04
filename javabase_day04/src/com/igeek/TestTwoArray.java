package com.igeek;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0
 * @description：
 * 
 * 定义格式
	数据类型[][] 数组名; 
	数据类型 数组名[][]; 不推荐
	数据类型[] 数组名[]; 不推荐
	初始化方式
	数据类型[][] 变量名 = new 数据类型[m][n]; m:行数；n：列数
	数据类型[][] 变量名 = new 数据类型[][]{{元素…},{元素…},{元素…}};
	简化版格式：数据类型[][] 变量名 = {{元素…},{元素…},{元素…}};

 */
public class TestTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		int arr1[][];
		//不推荐
		int[] arr2[];
		
		int[][] arr3 = new int[5][];
		int[][] arr4 = new int[5][8];
		int[][] arr5 = new int[][] {{1,2,3},{2,3,4}};
		int[][] arr6 = {{1,2,3},{2,3,4}};
		
		
	}

}
