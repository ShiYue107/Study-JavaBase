package com.mstanford.scme.oriented;

public class Truck extends Vehicles{
	public float load;//������

	public Truck() {
		
	}

	public Truck(float load) {
		this.load = load;
	}
	public void showTruck() {
		super.showIfo();
		System.out.println("����һ����"+this.name+"\t�ҵ���ɫ��"+this.color+"\t�ҵ����أ�"+this.load);
	}
}
