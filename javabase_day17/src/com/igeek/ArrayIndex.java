package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description：
 * 数组越界异常
 * java.lang.ArrayIndexOutOfBoundsException
 * 
 * 捕获异常
 * try{
 * 	//可能产生异常的代码
 * }catch(Type1 id1){
 *  //处理Type1异常的代码
 * }catch(Type2 id2){
 *  //处理Type2异常的代码
 * }
 * ...
 */
public class ArrayIndex {

	public static void main(String[] args) {
		int[] a = new int[10];
		int idx;
		Scanner scanner = new Scanner(System.in);
		idx = scanner.nextInt();
		try {
			a[idx] = 10;
			System.out.println("hello");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
		}
		System.out.println("hello exception");
		
	}

}
