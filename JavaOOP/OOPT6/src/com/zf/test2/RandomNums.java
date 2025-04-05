package com.zf.test2;

import java.util.Scanner;

public class RandomNums {
	//开始类
	public static void caiNum() {
		Scanner sc=new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		do {
			System.out.println("请输入您猜的数：");
			int number=sc.nextInt();
			if (num<number) {
				System.out.println("猜大了！");
				continue;
			}if (num>number) {
				System.out.println("猜小了！");
				continue;
			}else {
				System.out.println("恭喜你，猜对了！");
				return;
			}
		} while (true);
	}
	
	//静态代码块
	static {
		System.out.println("-----欢迎来到欢乐猜数字-----");
		System.out.println("请开始您的娱乐");
	}
	public static void main(String[] args) {
		RandomNums.caiNum();
	}
}
