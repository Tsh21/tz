package com.igeek;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description：
 * 如果你的方法可能抛出异常，就必须在函数头部加以声明
 * throws 
 * 
 * 你可以声明并不会真的抛出异常
 * 
 * 抛出子类异常会被捕捉 父类异常的catch给捕捉到。
 * 
 * 捕获任何异常？？？？
 * catch (Exception e) {
		e.printStackTrace();
	}
	
	总结：
	如果你调用一个声明会抛出异常的函数
	1.把函数的调用放在try块中，catch来捕捉所有有可能会抛出的异常；
	2.声明自己会抛出的无法处理的异常 throws
	
	运行时刻的异常
	像ArrayIndexOutOfBoundsException这种的异常是不需要声明的，
	但是如果没有适当的机制来捕获，会导致程序终止。
 * 
 * 
 */
class OpenException extends Exception{
	
}

class CloseException extends OpenException{
	
}

public class ArrayIndex04 {
	
	public static int open() {
		int[] a = new int[10];
		a[10] = 10;
		System.out.println("hello");
		return -1;
	}
	
	public static void readFile() throws OpenException ,CloseException {
		if(open() == -1) {
			//主动抛出异常
			throw new CloseException();
		}
	}
	
	//Unhandled exception type OpenException
	//Unhandled exception type CloseException
	public static void main(String[] args) throws CloseException, OpenException {
//		readFile();
		try {
			readFile();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (CloseException e) {
			System.out.println("close");
		}
		catch (OpenException e) {
			System.out.println("open");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("anything");
		}
		System.out.println("hello Exception");
		//Unreachable catch block for CloseException. 
		//It is already handled by the catch block for OpenException
//		catch (CloseException e) {
//			System.out.println("close");
//		}
		
	}

}
