package com.igeek;

public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建手机对象
		Phone phone = new Phone();
		
//		System.out.println(phone);
//		
//		System.out.println(phone.brand+";"+phone.color+";"+phone.opSys+";"+phone.price);
		
		phone.brand = "华为";
		phone.color = "黑色";
		phone.opSys="Android";
		phone.price= 10000;
//		System.out.println(phone.brand+";"+phone.color+";"+phone.opSys+";"+phone.price);
//		phone.call();
		
		Phone phone2 = phone;
		phone2.brand = "苹果";
		System.out.println(phone.brand+";"+phone.color+";"+phone.opSys+";"+phone.price);
		System.out.println(phone2.brand+";"+phone2.color+";"+phone2.opSys+";"+phone2.price);
		System.out.println(phone);
		System.out.println(phone2);

		
	} 

}
