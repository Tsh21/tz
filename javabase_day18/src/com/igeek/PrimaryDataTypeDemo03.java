package com.igeek;

/**
 * @author zx
 * @date 2019年3月26日
 * @version 1.0
 * @description:
 * 自动拆箱：将基本类型包装类的对象转成该基本类型的数值
   自动装箱：将基本类型的数值转成基本类型对应的包装类对象
 */
public class PrimaryDataTypeDemo03 {

	public static void main(String[] args) {
		int a1 = 4;
		//手动装箱
		Integer ai = new Integer(a1);
		//自动装箱
		Integer aj = a1;
		System.out.println(aj);
		System.out.println("#################");
		//手动拆箱
		int ah = ai.intValue();
		//自动拆箱
		int ag = ai;
		System.out.println(ag);

	}

}
