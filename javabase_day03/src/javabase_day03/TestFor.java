package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��
 * for(��ʼ�����;�ж��������;�����������) {
              ѭ�������;
	}
	//��ʼ�����
		int i=1;
		int sum=0;
		while(i<=100) {
			sum =sum+i;
			//�����������;
			i++;
	}
	
	A:ִ�г�ʼ�����
	B:ִ���ж�������䣬��������true����false
	�����false��ѭ��������
	�����true������ִ�С�
	C:ִ��ѭ�������
	D:ִ�п����������
	E:�ص�B����


 */
public class TestFor {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			sum = sum +i;
		}
		
		System.out.println(sum);

	}

}
