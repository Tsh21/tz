package com.igeek;

/**
 * 
 * @author zx
 * @date 2019��2��27��
 * @version 1.0
 * @description��
  *  �������ֲ�������
 * 1.�ֲ�������ʹ��ʱ��ʼ��
 * 2.�������ڣ�������λ�õ��������������ִ�н���Ϊֹ
 * 
  *  ��������Ա������
 * 1.���ڲ�����ı��������������
 * 2.�������ڣ������Ŷ���
 * 
  * ��������̬������
 * 1.�������ڣ���������
 */
public class TestVariable {
	
	boolean salary;//��Ա����
	
	static int size;//��̬����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int age= 8;//�ֲ�����,����
		}
//	    System.out.println(age);
		int i = 0;   //�ֲ�����,����
		int j = i+5;
		System.out.println(j);
		TestVariable testVaruable = new TestVariable();
		System.out.println(testVaruable.salary);
		System.out.println(TestVariable.size);
	}

}
