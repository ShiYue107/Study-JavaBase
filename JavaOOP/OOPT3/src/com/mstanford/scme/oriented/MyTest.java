package com.mstanford.scme.oriented;

public class MyTest {
	public static void main(String[] args) {
		Car v1=new Car(6);
		v1.name="Bmw";
		v1.color="ÂÌÉ«";
		v1.showCar();
		v1.run();
		
		Truck v2= new Truck(13.8f);
		v2.name="°ÔÌì»¢";
		v2.color="ºìÉ«";
		v2.showTruck();
	}
}
