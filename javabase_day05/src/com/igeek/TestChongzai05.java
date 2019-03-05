package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0 
 * @description： 方法的参数是引用类型： 形式参数的改变直接影响实际参数
 */
public class TestChongzai05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5 };
		// 遍历数组
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println("----------------");
		change(arr);
		System.out.println();
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+ " ");
		}

	}

	static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 如果元素是偶数，值就变为以前的2倍
			if (arr[i] % 2 == 0) {
				arr[i] *= 2;// arr[i] = arr[i] *2;
			}
		}
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
	}

}
