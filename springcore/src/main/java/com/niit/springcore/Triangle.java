package com.niit.springcore;

//attributes are set using Constructor Injection
public class Triangle {

	private String Type;
	private int height;
	
	
	public Triangle(String type) {
	
		Type = type;
	}
	
	public Triangle(int height) {
		
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		
		Type = type;
		this.height = height;
	}
	
	public void draw()
	{
		System.out.println(this.Type+" Triangle is drawn of height"+this.height);
	}
}
