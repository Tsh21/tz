package javabase_day02;

import java.util.Scanner;

/**
 * @author zx
 * @date 2019��2��28��
 * @version 1.0
 * @description������¼��
 * A:����(λ�÷ŵ�class���������)
	import java.util.Scanner;
   B:��������
	Scanner sc = new Scanner(System.in);
   C:��������
	int x = sc.nextInt();

 */
public class TestScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(x);
	}

}
