package com.igeek;

public class Diamond {
	 
	/**
	 * ����οյĽ�����
	 */
	public static void main(String[] args) {
		int lay=4;
		//�����ϰ벿����
		/*  ��һ��==>3���ո�  1*
		 *  �ڶ���==>2���ո�  3*
		 *  ������==>1���ո�  5*
		 *  ���Ĳ�==>0���ո�  7*  
		 *  ���ɣ�2(n-1)+1
		 */
		for(int i=1;i<=lay-1;i++){ //�ж�ѭ���ϰ벿��
			for(int k=1;k<=lay-i;k++){ //������*��ǰ����ո�
				System.out.print(" ");
			}
			for(int j=1;j<=(i-1)*2+1;j++){ //����������ǵ�λ��
				  //�ж�����С���Ⱥ���󳤶ȣ�������С���Ⱥ���󳤶������*�ţ�����������ո�
				  if(j==1||j==(i-1)*2+1){ 
					  
					  System.out.print("*"); 
				  }
				  else{ 
					  System.out.print(" "); 
				  }
				 
			}
			System.out.println(); //����
		}
		/*  ��һ��==>0���ո�  7* 
		 *  �ڶ���==>1���ո�  5* 
		 *  ������==>2���ո�  3* 
		 *  ���Ĳ�==>3���ո�  1*  
		 *  ���ɣ�2(n-1)+1
		 */
		for(int i=1;i<=lay;i++){  //�ж�ѭ�������°벿��
			for(int k=1;k<=i-1;k++){ //�ж�ѭ����*��ǰҪ����ո�
				System.out.print(" ");
			}
			for(int j=1;j<=(lay-i)*2+1;j++){ //�ж�ѭ���г���
				//�ж�����С���Ⱥ���󳤶ȣ�������С���Ⱥ���󳤶������*�ţ�����������ո�
				  if(j==1||j==(lay-i)*2+1){ 
					  System.out.print("*"); 
				  }else{ 
					  System.out.print(" "); 
				  }
				 
			}
			System.out.println();//�������
		}
	}
 
}