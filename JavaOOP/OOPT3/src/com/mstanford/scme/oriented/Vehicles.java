package com.mstanford.scme.oriented;

public class Vehicles {
	public String name;//Ʒ��
	public String color;//��ɫ
	
	public Vehicles() {
		
	}

	public Vehicles(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void run() {
		System.out.println("��"+name+"������ʻ");
	}
	
	public void showIfo() {
		System.out.println("Ʒ�ƣ�"+name+"\t��ɫ��"+color);
	}
}
