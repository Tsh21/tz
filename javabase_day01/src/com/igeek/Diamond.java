package com.igeek;

public class Diamond {
	 
	/**
	 * 输出镂空的金字塔
	 */
	public static void main(String[] args) {
		int lay=4;
		//菱形上半部行数
		/*  第一层==>3个空格  1*
		 *  第二层==>2个空格  3*
		 *  第三层==>1个空格  5*
		 *  第四层==>0个空格  7*  
		 *  规律：2(n-1)+1
		 */
		for(int i=1;i<=lay-1;i++){ //判断循环上半部分
			for(int k=1;k<=lay-i;k++){ //找行内*号前输出空格
				System.out.print(" ");
			}
			for(int j=1;j<=(i-1)*2+1;j++){ //找行内输出星的位置
				  //判断行最小长度和最大长度，并在最小长度和最大长度上输出*号，行内输入出空格。
				  if(j==1||j==(i-1)*2+1){ 
					  
					  System.out.print("*"); 
				  }
				  else{ 
					  System.out.print(" "); 
				  }
				 
			}
			System.out.println(); //换行
		}
		/*  第一层==>0个空格  7* 
		 *  第二层==>1个空格  5* 
		 *  第三层==>2个空格  3* 
		 *  第四层==>3个空格  1*  
		 *  规律：2(n-1)+1
		 */
		for(int i=1;i<=lay;i++){  //判断循环菱形下半部分
			for(int k=1;k<=i-1;k++){ //判断循环找*号前要输出空格处
				System.out.print(" ");
			}
			for(int j=1;j<=(lay-i)*2+1;j++){ //判断循环行长度
				//判断行最小长度和最大长度，并在最小长度和最大长度上输出*号，行内输入出空格。
				  if(j==1||j==(lay-i)*2+1){ 
					  System.out.print("*"); 
				  }else{ 
					  System.out.print(" "); 
				  }
				 
			}
			System.out.println();//输出换行
		}
	}
 
}