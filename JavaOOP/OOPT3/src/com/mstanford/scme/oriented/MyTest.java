package com.mstanford.scme.oriented;

public class MyTest {
	public static void main(String[] args) {
		Car v1=new Car(6);
		v1.name="Bmw";
		v1.color="��ɫ";
		v1.showCar();
		v1.run();
		
		Truck v2= new Truck(13.8f);
		v2.name="���컢";
		v2.color="��ɫ";
		v2.showTruck();
	}
}
