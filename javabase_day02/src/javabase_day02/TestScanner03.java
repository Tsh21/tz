package javabase_day02;

import java.util.Scanner;

/**
 * @author ף��
 * @date 2019��2��28��
 * @version 1.0
 * @description��2. ����¼���������ݣ���ȡ�����������е����ֵ
 */
public class TestScanner03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();
		System.out.println("���������������");
		int c = scanner.nextInt();
		
//		int temp = a>b ? a:b;
//		int max = temp>c ? temp : c;
//		System.out.println("max="+max);
		
		System.out.println((a>b ? a:b)>c ? (a>b ? a:b ): c);

	}

}
