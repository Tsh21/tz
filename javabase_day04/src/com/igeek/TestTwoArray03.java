package com.igeek;

/**
 * @author zx
 * @date 2019年3月4日
 * @version 1.0
 * @description：杨辉三角，是二项式系数在三角形中的一种几何排列
 * (a+b)n
 * n=0, 1
 * n=1, 1 1
 * n=2, 1 2 1
 * n=3, 1 3 3 1
 * 
  *  利用二维数组打印前7行的杨辉三角形
 */
public class TestTwoArray03 {

	public static void main(String[] args) {
		int i,j;
		int level=7;
		int[][] isYang = new int[level][];
		
		System.out.println("杨辉三角形");
		for(i=0;i<isYang.length;i++) {
			isYang[i] = new int[i+1];
		}
		isYang[0][0]=1;
		for (i = 1; i < isYang.length; i++) {
			isYang[i][0]=1;
			for(j=1;j<isYang[i].length-1;j++) {
				isYang[i][j] = isYang[i-1][j]+isYang[i-1][j-1];
			}
			isYang[i][isYang[i].length-1]=1;
		}
		
		for (int[] ks : isYang) {
			for (int ks2 : ks) {
				System.out.print(ks2+" ");
			}
			System.out.println();
		}
	}

}
