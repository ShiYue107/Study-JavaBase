package com.t3;

public class SellShouP implements Runnable {
	private int p=30;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (p>0) {
				sellP();
			}else {
				break;
			}
		}
	}

	public synchronized void sellP() {
		if (this.p>0) {
			try {
				Thread.sleep(50);
				System.out.println(Thread.currentThread().getName()+"���۵�"+p--+"�ų�Ʊ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		SellShouP ssp=new SellShouP();
		Thread t1=new Thread(ssp);
		t1.setName("����A");
		Thread t2=new Thread(ssp);
		t2.setName("����B");
		Thread t3=new Thread(ssp);
		t3.setName("����C");
		t1.start();
		t2.start();
		t3.start();
	}
}
