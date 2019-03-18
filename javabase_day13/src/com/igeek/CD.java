package com.igeek;

public class CD extends Item{
	
	private String artist;
	
	public CD(String title, String artist, int playingTime, String comment) {
		super(title,playingTime,comment);
		this.artist = artist;
	}

	public void print() {
		System.out.println("title:"+super.getTitle()+";artist:"+artist+";comment:"+super.getComment());
	}
}
