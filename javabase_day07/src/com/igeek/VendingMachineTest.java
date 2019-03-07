package com.igeek;

/**
 * @author zx
 * @date 2019年3月7日
 * @version 1.0
 * @description：
 * 是一个权限修饰符。
	可以修饰成员(成员变量和成员方法)
	被private修饰的成员只在本类中才能访问。 

 */
public class VendingMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vendingmachine vendingmachine = new Vendingmachine();
//		System.out.println(vendingmachine.balance);
//		System.out.println(vendingmachine.total);
//		System.out.println(vendingmachine.price);
//		vendingmachine.price=-10;
//		System.out.println(vendingmachine.price);
		vendingmachine.setPrice(-10);
		System.out.println(vendingmachine.getPrice());
		

	}

}
