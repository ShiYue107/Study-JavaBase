package com.t2;

public class QZC extends Thread{
	public QZC(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			System.out.println("���ϳ�������ǰ��"+i+"km���ϰ�");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
