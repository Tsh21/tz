package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��continue  ��������ѭ��������ѭ���� ��һ��
 */
public class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1; x<=10; x++) {
			if(x == 3) {
				continue;
			}
			System.out.println(x);
		}
	}

}
