package com.mstanford.scme.oriented;

public class Car extends Vehicles{
	public int seats;//��λ��
	
	public Car() {
		
	}

	public Car(int seats) {
		this.seats = seats;
	}
	
	public void showCar() {
		super.showIfo();
		System.out.println("����һ����"+this.name+"\t�ҵ���ɫ��"+this.color+"\t���У�"+this.seats);
	}
}
