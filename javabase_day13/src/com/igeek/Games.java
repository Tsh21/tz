package com.igeek;

public class Games extends Item{
	
	private String director;
	private String type;
	private String platform;
	
	public Games(String title, String director, int playingTime, String comment, String type, String platform) {
		super(title,playingTime,comment);
		this.director = director;
		this.type = type;
		this.platform = platform;
	}
	
	public void print() {
		System.out.println("title:"+super.getTitle()+";platform:"+platform+";comment:"+super.getComment());
	}
	
	

}
