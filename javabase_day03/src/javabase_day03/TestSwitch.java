package javabase_day03;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��
 * switch����ʽ��
 	switch(���ʽ) {
		case ֵ1 :
 	 			�����1;
 	 			break;
 		case ֵ2 :
				�����2;
 				break;
 		...
 		default:
			�����n+1;
 			break;
 	}
 	
 	���ȼ�������ʽ��ֵ
	��Σ���case���αȽϣ�һ���ж�Ӧ��ֵ���ͻ�ִ����Ӧ����䣬��ִ�еĹ����У�����break�ͻ������
	���������е�case���ͱ��ʽ��ֵ��ƥ�䣬�ͻ�ִ��default����岿�֣�Ȼ������������
	
	break��ʾ�жϣ���������˼�����Խ���switch���

 */
public class TestSwitch {

	public static void main(String[] args) {
		// ���ݼ���¼�����ֵ1��2��3����7�����Ӧ������һ�����ڶ����������������ա�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������1~7�����֣�");
		int num = scanner.nextInt();
		
		//break ����
		switch(num) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
//		default:
//			System.out.println("���������������");
//			break;
		}

		
		
		
	}

}
