package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description���������1-100֮��ż����	
 */
public class TestFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		//��ȡ1-100֮������ݣ���forѭ��ʵ��
		for(int x=1; x<=100; x++) {
			//�ѻ�ȡ�������ݽ����жϣ����Ƿ���ż��
			if(x%2 ==0) {
				sum += x;
			}
		}
		
		//�����ͽ��
		System.out.println("sum:"+sum);

		
	}

}
