package javabase_day02;

/**
 * @author ף��
 * @date 2019��2��28��
 * @version 1.0
 * @description��	��Ԫ�����
 * A:��ʽ
	(��ϵ���ʽ) ? ���ʽ1 �����ʽ2��
	
	�������Ϊtrue�������Ľ���Ǳ��ʽ1��
	�������Ϊfalse�������Ľ���Ǳ��ʽ2��
   B:ʾ����
	��ȡ�������д�����
	int x=3,y=4,z;
	z = (x>y)?x:y;//z�����洢�ľ����������Ĵ���

 */
public class TestOperation06 {

	public static void main(String[] args) {
		int x=5,y=4,z;
		z = (x>y) ? x : y;
		System.out.println(z);
		
		int score = 80;
		String type = score<60 ? "������" : "����";
		System.out.println(type);
		
		if(score<60) {
			System.out.println("������");
		}else {
			System.out.println("����");
		}
		
		//Ƕ�� 
		int x1 = -100;
		System.out.println(x1 > 0 ? 1:(x1 == 0 ? 0:-1));

	}

}
