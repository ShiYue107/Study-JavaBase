package com.demo2;

public class Maim implements Runnable{
	static int Mian=30;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(Thread.currentThread().getName()+"卖出第"+Mian--+"碗面");
			if (Mian<=0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Maim m1=new Maim();
		Maim m2=new Maim();
		Maim m3=new Maim();
		Thread t1=new Thread(m1);
		t1.setName("窗口1");
		Thread t2=new Thread(m2);
		t2.setName("窗口2");
		Thread t3=new Thread(m3);
		t3.setName("窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
