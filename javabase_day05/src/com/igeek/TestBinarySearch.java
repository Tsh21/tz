package com.igeek;

/**
 * @author zx
 * @date 2019年3月5日
 * @version 1.0
 * @description：
 * 二分查找
 */
public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,8,9,10,12,20,30,40,50,80,100};
		int index = binarySearch(arr, 40);
		System.out.println(index);
		System.out.println(arr[index]);

	}
	
	public static int binarySearch(int[] arr,int key) {
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(arr[mid]==key) {
				return mid;
			}
			
			if (key>arr[mid]) {
				left=mid+1;
			}
			
			if (key<arr[mid]) {
				right=mid-1;
			}
		}
		return -1;
	}

}
