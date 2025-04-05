package com.t3;

public class Current implements Runnable{
	static Current curr=new Current();
	static int num=20;
	
	public void fech(String name) {
		synchronized (curr) {
			if (num>0) {
				System.out.println(name+"\t采花❀\t"+num);
				num--;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while (num>0) {
			this.fech(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Thread t1=new Thread(curr);
		t1.setName("猴子A");
		Thread t2=new Thread(curr);
		t2.setName("猴子B");
		Thread t3=new Thread(curr);
		t3.setName("猴子C");
		t1.start();
		t2.start();
		t3.start();
	}
}	
