package com.homwork01;

public class Car {
	
	private boolean status=true;//true表示运行状态一种,false表示停止状态.
	
	//成员内部类
	public class Engine {
		
		public void work() {
			if(status) {
				System.out.println("飞速旋转");
			}else {
				System.out.println("停止工作");
			}
		}
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
