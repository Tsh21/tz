package com.igeek;

import java.io.IOException;
import java.text.ParseException;
import java.util.zip.DataFormatException;

/**
 * @author zx
 * @date 2019年3月25日
 * @version 1.0
 * @description:
   *   如果父类抛出了多个异常,子类覆盖父类方法时,只能抛出相同的异常或者是他的子集,只能少不能多
 *	父类方法没有抛出异常，子类覆盖父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
 *
 *	现实开发过程中,一般子类重写的方法抛出的异常与父类方法抛出的异常是一样的,不存在不一样的情况.

 */
public class MultiExceptionNotesDemo {

	class Fu {
		/**  
		* @Title: method  
		* @Description: 父类中抛出异常的方法  
		* @throws IOException
		* @throws ParseException
		* @throws DataFormatException    
		*/
		public void method() throws IOException,
		ParseException,DataFormatException{
			 //产生异常的方法体
		}
		
	}
	
	class Zi extends Fu {
		
		/**  
		* @Title: method  
		* @Description: 子类中重写父类的方法  
		* @throws IOException
		* @throws ParseException
		* @see javaadvanced1_d03_c03.MultiExceptionNotesDemo.Fu#method()
		*/
		@Override
		public void method() throws IOException, ParseException,DataFormatException {
			//子类的方法体
		}
	 }



}
