package javabase_day03;
/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��
 */
public class TestIF02 {

	public static void main(String[] args) {
		//ͨ��Math.random()���������
		double d = Math.random();//���ء�0,1��
		System.out.println(d);
		
		int h = (int) (6*(Math.random())+1);
		System.out.println(h);
		if(h<3) {
			System.out.println("С");
		}
		
		/*
		 * ���������ӣ�����������֮�ʹ���15�������������������֮����10��15֮�䣬�������һ�㣻С��10 ��������ô��
		 */
		int a = (int) (6*(Math.random())+1);
		int b = (int) (6*(Math.random())+1);
		int c = (int) (6*(Math.random())+1);
		//����֮��
		int sum = a+b+c;
		System.out.println("sum="+sum);
		if(sum >15) {
			System.out.println("��������");
		}
		if(sum >=10 && sum <=15) {//   10<=sum<=15
			System.out.println("����һ��");
		}
		if(sum <10) {
			System.out.println("��������ô��");
		}

	}

}
