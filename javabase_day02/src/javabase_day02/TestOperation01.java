package javabase_day02;

/**
 * 
 * @author zx
 * @date 2019��2��28��
 * @version 1.0
 * @description��2.1	��������� + - * /  % ģ(ȡ��) ��һԪ�����  ++�� --
 * 
 * �������㣺
 * 1.��������������һ��Long,���ҲΪLong
 * 2.��������������һ��double,���ҲΪLong
 */
public class TestOperation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		byte a = 1;
		int b = 2;
//		byte c = a+b;
		int c = a+b;
		long b2 = 3;
		
		long c2 = b2+b;
		
		float f = 3.14F;
		
		double f1 = f+6.23;
		
		float f2 = 3.14F;
		
		float f3 = f+f2;
		
		System.out.println(7%3);
		System.out.println(7/3);
		System.out.println(-7%3);
		System.out.println(7%-3);
		System.out.println("###########");
		int cf = 3;
		int b4 = cf++;//cf��ֵ��b4��cf��������1
		System.out.println(b4);
		System.out.println(cf);
		System.out.println("###########");
		cf = 3;
		b4 = ++cf;//cf����1��cf��ֵ��b4��
		System.out.println(b4);
		System.out.println(cf);
		System.out.println("###########");
		cf = 3;
		++cf;
		cf++;
		System.out.println(cf);
		

	}

}
