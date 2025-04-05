package com.mstanford.scme.oriented;

public class Truck extends Vehicles{
	public float load;//载重量

	public Truck() {
		
	}

	public Truck(float load) {
		this.load = load;
	}
	public void showTruck() {
		super.showIfo();
		System.out.println("我是一辆："+this.name+"\t我的颜色："+this.color+"\t我的载重："+this.load);
	}
}
