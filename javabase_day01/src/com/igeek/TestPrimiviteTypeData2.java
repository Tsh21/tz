package com.igeek;

import java.math.BigDecimal;

/**
 * @author 祝祥
 * @date 2019年2月27日
 * @version 1.0
 * @description：浮点型
 */
public class TestPrimiviteTypeData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 3.14F;
		double b = 6.28;
		double c = 6.28E-2;//科学计数法
//		System.out.println(c);
		
		//浮点数是不精确的，一定不要用于比较
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d);
		
		float d1 = 423432423f;
		float d2 = d1 +1;
		if(d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println("d1!=d2");
		}
		
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
		
		BigDecimal bd1 = BigDecimal.valueOf(0.1);
		BigDecimal bd2 = BigDecimal.valueOf(1.0/10.0);
		System.out.println(bd1.equals(bd2));
		
		
	}

}
