package javabase_day03;

/**
 * @author zx
 * @date 2019��3��1��
 * @version 1.0
 * @description��Ƕ��ѭ��
 * 1.��ӡ�žų˷���
 *  1*1=1
 *  1*2= 2 2*2= 4
 *  ......
 */
public class TestFor03 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			//\t  tab��
			for(int m=1;m<=i;m++) {
				System.out.print(m +"*"+i+"="+(m*i)+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
