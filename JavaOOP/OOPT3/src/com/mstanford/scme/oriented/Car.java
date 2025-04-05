package com.mstanford.scme.oriented;

public class Car extends Vehicles{
	public int seats;//座位数
	
	public Car() {
		
	}

	public Car(int seats) {
		this.seats = seats;
	}
	
	public void showCar() {
		super.showIfo();
		System.out.println("我是一辆："+this.name+"\t我的颜色："+this.color+"\t我有："+this.seats);
	}
}
