package com.t2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QZC qzc=new QZC("清障车");
		PCar carA=new PCar(qzc, "车辆A");
		PCar carB=new PCar(qzc, "车辆B");
		PCar carC=new PCar(qzc, "车辆C");
		PCar carD=new PCar(qzc, "车辆D");
		qzc.start();
		carA.start();
		carB.start();
		carC.start();
		carD.start();
	}

}
