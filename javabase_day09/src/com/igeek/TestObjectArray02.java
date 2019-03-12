package com.igeek;

/**
 * @author zx
 * @date 2019年3月11日
 * @version 1.0
 * @description：
 * 创建一个手机数组，存储三个手机对象并遍历
 */
public class TestObjectArray02 {

	public static void main(String[] args) {
//		String[] arr = new String[3];
//		arr[0]="hello";
		
		Phone[] phones = new Phone[3];
		
		Phone phone1 = new Phone("Red", "Apple", 5000); 
		Phone phone2 = new Phone("Red", "HUAWEI", 5000); 
//		Phone phone3 = new Phone("Red", "MI", 5000); 
		
		phones[0]= phone1;
		phones[1]= phone2;
//		phones[2]= phone3;
		
		for (int i = 0; i < phones.length; i++) {
			Phone phone = phones[i];
			if (phone != null) {
				System.out.println(phone.getBrand()+";"+phone.getColor()+";"+phone.getPrice());
			}
		}

	}

}
