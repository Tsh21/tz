package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��
 *  if(��ϵ���ʽ) {
		     �����1;
	}else {
		�����2;
	}
	ִ������
	�����жϹ�ϵ���ʽ��������true����false
	�����true��ִ�������1
	�����false��ִ�������2

 */
public class TestIfElse {

	public static void main(String[] args) {
		// �жϸ�������������������ż��
		int a = 100;
		// ��a���¸�ֵ
		a = 99;

		if (a % 2 == 0) {
			System.out.println("a��ż��");
		} else {
			System.out.println("a������");
		}
		
		/*
		 * �������������[0��4����Բ�İ뾶����Բ��������ܳ���
		 * �Ƚ�������ܳ��������>=�ܳ������������ڵ����ܳ�������������С���ܳ�
		 */
		//�뾶
		double radius = 4*Math.random();
		//�����
//		double area = 3.14*radius*radius;
		//Math.pow(radius, 2)�ȼ�redius*radius
		double area = Math.PI*Math.pow(radius, 2);
		//�ܳ�
		double perimeter = 2*Math.PI*radius;
		System.out.println("radius="+radius);
		System.out.println("area="+area);
		System.out.println("perimeter="+perimeter);
		
		if(area>=perimeter) {
			System.out.println("������ڵ����ܳ�");
		}else {
			System.out.println("���С���ܳ�");
		}
		

	}

}
