package com.igeek;

import java.math.BigDecimal;

/**
 * @author ף��
 * @date 2019��2��27��
 * @version 1.0
 * @description��������
 */
public class TestPrimiviteTypeData2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 3.14F;
		double b = 6.28;
		double c = 6.28E-2;//��ѧ������
//		System.out.println(c);
		
		//�������ǲ���ȷ�ģ�һ����Ҫ���ڱȽ�
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
