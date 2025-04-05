package com.demo2;

public class Maim2 extends Thread{
	static int mian=30;
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+"卖出第"+mian--+"碗面");
			if (mian<=0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		Maim2 m1=new Maim2();
		m1.setName("窗口1");
		Maim2 m2=new Maim2();
		m2.setName("窗口2");
		Maim2 m3=new Maim2();
		m3.setName("窗口3");
		m1.start();
		m2.start();
		m3.start();
	}
}
