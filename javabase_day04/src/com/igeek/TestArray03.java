package com.igeek;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0
 * @description：
  *   需求：数组获取最值(获取数组中的最大值最小值)
 *   
  *   分析：先拿到数组中的第一个元素作为参照物；
  *             接着和数组后面的所有元素和参照物进行比较，如果有元素比参照物大，就留下来；
  *             整个比较完后，留下来的就是最大值
 */
public class TestArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {12,56,89,5,78};
        
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]<min) {
        		min = arr[i];
        	}
        }
        System.out.println(min);
	}

}
