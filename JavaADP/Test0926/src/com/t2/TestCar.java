package com.t2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QZC qzc=new QZC("���ϳ�");
		PCar carA=new PCar(qzc, "����A");
		PCar carB=new PCar(qzc, "����B");
		PCar carC=new PCar(qzc, "����C");
		PCar carD=new PCar(qzc, "����D");
		qzc.start();
		carA.start();
		carB.start();
		carC.start();
		carD.start();
	}

}
