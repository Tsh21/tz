package com.igeek;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description:
   *  当我们重写函数的时候，子类是不能声明抛出的父类的方法更多版本的异常;
 *    在子类的构造函数，必须要声明父类可能抛出的全部异常
 */

class OpenException02 extends Exception{
}

class CloseException02 extends OpenException02{
	
}

class NewException extends Exception{
	
}

public class ArrayIndex05 {
	
	public ArrayIndex05() throws OpenException02{
		
	}
	
	public void f() throws OpenException02{
		
	}
}

//Default constructor cannot handle exception type OpenException02 
//thrown by implicit super constructor. Must define an explicit constructor
class NewClass extends ArrayIndex05 {

	public NewClass() throws OpenException02,NewException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Exception NewException is not compatible 
	//with throws clause in ArrayIndex05.f()
	public void f() {
	}
	
	public static void main(String[] args) {
		try {
			ArrayIndex05 index05 = new NewClass();
			index05.f();
		}  catch (OpenException02 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
