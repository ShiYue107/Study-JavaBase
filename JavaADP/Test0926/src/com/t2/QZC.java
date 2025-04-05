package com.t2;

public class QZC extends Thread{
	public QZC(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			System.out.println("清障车已清理前方"+i+"km的障碍");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
