package com.igeek;

public class DVD extends Item{
	
	private String director;
	
	public DVD(String title, String director, int playingTime,String comment) {
		super(title,playingTime,comment);
		this.director = director;
	}
	
	public void print() {
		System.out.println("title:"+super.getTitle()+";director:"+director+";comment:"+super.getComment());
	}

}
