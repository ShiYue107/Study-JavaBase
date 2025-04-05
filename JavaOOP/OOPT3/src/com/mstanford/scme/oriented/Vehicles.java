package com.mstanford.scme.oriented;

public class Vehicles {
	public String name;//品牌
	public String color;//颜色
	
	public Vehicles() {
		
	}

	public Vehicles(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void run() {
		System.out.println("我"+name+"正在行驶");
	}
	
	public void showIfo() {
		System.out.println("品牌："+name+"\t颜色："+color);
	}
}
