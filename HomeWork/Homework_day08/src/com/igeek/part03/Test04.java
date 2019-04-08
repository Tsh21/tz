package com.igeek.part03;

/**
 * @author zx
 * @date 2019年4月8日
 * @version 1.0
 * @description:
 * 嵌套循环
 * 将50元兑换成5元,2元和1元.每种面额的钱不能为0张.共有几种兑换方法.每种兑换方法的钱是怎么样的?
 */
public class Test04 {

	public static void main(String[] args) {
		int count = 0;
		//i:5元;j:2元;k:1元
		for(int i=1;i<10;i++) {
			for(int j=1;j<25;j++) {
				for(int k=1;k<50;k++) {
					if(i*5 + j*2 + k == 50) {
						System.out.println("5元："+i+"张;"+"2元："+j+"张；1元"+k+"张");
						count++;
					}
				}
			}
		}
		System.out.println("count:"+count);

	}

}
