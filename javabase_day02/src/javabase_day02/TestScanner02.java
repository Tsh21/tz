package javabase_day02;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019��2��28��
 * @version 1.0 @description�� 1. ����¼���������ݱȽ��Ƿ���� 
 */
public class TestScanner02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�������һ������");
		int a = scanner.nextInt();
		System.out.println("������ڶ�������");
		int b = scanner.nextInt();

		System.out.println(a == b);

	}

}
