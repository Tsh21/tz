package javabase_day02;

/**
 * @author zx
 * @date 2019��2��28��
 * @version 1.0
 * @description���߼������  &,|,^,! &&,|| 
 *  &�߼���:��false��false��
 	|�߼���:��true��true��
 	^�߼����:��ͬΪfalse����ͬΪtrue��
 	!�߼���:��false��true����true��false��
 */
public class TestOperation04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * boolean a = false; boolean b = false;
		 * 
		 * System.out.println(a&b); System.out.println(a|b); System.out.println(!a);
		 * //��� System.out.println(a^b);
		 */
		
		//��·
//		int c = 3/0;
//		System.out.println(c);
		/*
		 * a:&&���ж�·Ч���������false���ұ߲�ִ�С�
		 * b:||���ж�·Ч���������true,�ұ߲�ִ��
		 */
		boolean b3 = 1>2 || 2<(3/0);
		System.out.println(b3);

	}

}
