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
				System.out.println("��"+qzc.getName()+"�������ϰ���,"+this.getName()+
						"��ʻ��"+i+"km");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
