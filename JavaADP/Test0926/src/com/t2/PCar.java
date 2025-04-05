package com.t2;

public class PCar extends Thread{
	private QZC qzc;
	
	public PCar(QZC qzc,String name) {
		setName(name);
		this.qzc=qzc;
	}
	
	@Override
	public void run() {
		try {
			qzc.join();
			for (int i =1; i <=3; i++) {
				System.out.println("在"+qzc.getName()+"清理完障碍后,"+this.getName()+
						"行驶了"+i+"km");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
