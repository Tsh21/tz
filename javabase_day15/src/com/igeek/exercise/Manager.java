package com.igeek.exercise;

public class Manager extends Employee implements Drivable{
	//奖金
	private double bounds;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary,double bounds) {
		super(name, salary);
		this.bounds =bounds;
	}

	@Override
	public void work() {
		System.out.println("管理酒店");
	}

	public double getBounds() {
		return bounds;
	}

	public void setBounds(double bounds) {
		this.bounds = bounds;
	}

	@Override
	public void theoryTest() {
		System.out.println("驾照理论习题1000道");
	}

	@Override
	public void fieldDrive() {
		System.out.println("会倒车入库,会侧方停车");
		
	}

	@Override
	public void roadDrive() {
		System.out.println("不撞人,不闯红灯");
		System.out.println("经理开的是高级车奇瑞qq~");
		
	}
	
	

}
