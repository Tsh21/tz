package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��
 *  if(��ϵ���ʽ1) {
		     �����1;
	}else  if (��ϵ���ʽ2) {
			     �����2;
	}else  if (��ϵ���ʽ3) {
			     �����3;
	}else  if (��ϵ���ʽ4) {
			     �����4;
	}
	    ��
	else {
			     �����n+1;
	}
	ִ������
	�����жϹ�ϵ���ʽ1��������true����false
	�����true��ִ�������1
	�����false�ͼ����жϹ�ϵ���ʽ2��������true����false
	�����true��ִ�������2
	�����false�ͼ����жϹ�ϵ���ʽ����������true����false
	��
	���û���κι�ϵ���ʽΪtrue����ִ�������n+1

 */
public class TestIfElseElseIf {

	public static void main(String[] args) {
		/*
		 *  ����������䣬С��15����ͯ��С��30�����ꣻС��50 ���ꣻС��65 ������ ��������
		 */
		int age = (int) (100*Math.random());
		System.out.println(age);
		if(age<15) {
			System.out.println("��ͯ");
		}
		else if (age <30) {
			System.out.println("����");
		}
		else if (age <50) {
			System.out.println("����");
		}
		else if (age <65) {
			System.out.println("��������");
		}
		else if (age <85) {
			System.out.println("����");
		}
		else {
			System.out.println("������");
		}
		

	}

}
