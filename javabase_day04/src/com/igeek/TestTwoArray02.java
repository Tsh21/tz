package com.igeek;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0 @description： 遍历思想: 首先使用循环遍历出二维数组中存储的每个一维数组,
 *          然后针对每个遍历到的一维数组在使用循环遍历该一维数组中的元素
 * 
 */
public class TestTwoArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 遍历数组
		for (int j = 0; j < arr[0].length; j++) {
			System.out.print(arr[0][j] + " ");
		}
		System.out.println();
		for (int j = 0; j < arr[1].length; j++) {
			System.out.print(arr[1][j] + " ");
		}
		System.out.println();
		for (int j = 0; j < arr[2].length; j++) {
			System.out.print(arr[2][j] + " ");
		}
		System.out.println();
		
		System.out.println("###########################");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		
	}

}
