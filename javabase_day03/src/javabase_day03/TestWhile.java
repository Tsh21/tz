package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��whileѭ��
 * 
 * ������ʽ
   while(�ж��������) {
          ѭ�������;
   }
	��չ��ʽ
	
	   ��ʼ�����;
	   while(�ж��������) {
	         ѭ�������;
	         �����������;
	}
	
    ����1+2+3+4+...+100=5050;
 */
public class TestWhile {

	public static void main(String[] args) {
		//��ʼ�����
		int i=1;
		int sum=0;
		while(i<=100) {
			sum =sum+i;
			//�����������;
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println(i);
	}

}
