package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��do��whileѭ��
 * ������ʽ
   do {
         ѭ�������;
   }while(�ж��������);
   
	��չ��ʽ
	   ��ʼ�����;
	   do {
	         ѭ�������;
	         �����������;
	} while(�ж��������);
	
	do��whileѭ�����ٻ�ִ��һ��ѭ���塣

 */
public class TestdoWhile {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		//��ִ�У����ж�
		do {
			sum += i;//sum = sum+i
			i++;
		} while (i <=100);
		System.out.println(sum);
		
		System.out.println("############");
		//��ʼ�����
		int i1=1;
		int sum1=0;
		//���жϣ���ִ��
		while(i1<=100) {
			sum1 =sum1+i1;
			//�����������;
			i1++;
		}
		System.out.println("sum="+sum1);

	}

}
