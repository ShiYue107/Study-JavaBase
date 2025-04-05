package com.demo4;

public class YuDi {
	private static YuDi yuD=new YuDi();
	private YuDi() {
		
	}
	public static YuDi getInfo() {
		return yuD;
	}
	public static void main(String[] args) {
		
	}
}
class DaC{
	public static void main(String[] args) {
		YuDi yd1=YuDi.getInfo();
		YuDi yd2=YuDi.getInfo();
		YuDi yd3=YuDi.getInfo();
		System.out.println("大臣们拜见的是否是同一个玉帝："+(yd1==yd2&&yd2==yd3));
	}
}