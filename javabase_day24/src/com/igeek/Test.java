package com.igeek;

public class Test {
	
	public static void main(String[] args) {
//		int h = 25860399;
//		int length = 16;
//		myHash(h,length);
		
		/**
		 * &：不管&的左边是true还是false，右边都会进行运算 
		   &&： 只要左边是false，右边就不会进行运算 
                            一半情况下都会选择&&，因为这样可以提高效率，也可以进行异常处理，当右边产生异常的时候，同样可以跳过。
		 */
		boolean a = true;
		boolean b = false;
		int i = 10;
		if(a&(i++)>0)
		    System.out.print(i);   //输出11，即&的右边有进行运算
		else
		    System.out.print(i);
		System.out.println("########");
		int i1 = 10;
		if(a&&(i1++)>0)
		    System.out.print(i);   //输出10,即&&的右边没有运算
		else
		    System.out.print(i);
		/**
		 * | ： 当左边为true时，右边同样进行运算 
			|| ： 当左边为true时，右边不再进行运算
		 */
		if(a|(i++)>0)
		    System.out.print(i);   //输出11,即的右边有进行运算
		else
		    System.out.print(i);
		if(a||(i++)>0)
		    System.out.print(i);   //输出10,即||的右边没有运算
		else
		    System.out.print(i);
		
	}

	public static void myHash(int h, int length) {
		System.out.println(h&(length-1));
		System.out.println(h%(length));
	}

}
