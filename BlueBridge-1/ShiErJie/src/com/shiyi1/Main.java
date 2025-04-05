package com.shiyi1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("\t欢迎进入电子商务系统");
		System.out.println("*******************************");
		System.out.println("\t1.查看商品\n\t2. 我的购物车\n\t3. 购物结算\n\t4. 注销");
		System.out.println("*******************************");
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入选项：");
		int num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("查看商品>进入查看商品界面！");
			break;
		case 2:
			System.out.println("查看商品>进入我的购物车界面！");
			break;
		case 3:
			System.out.println("查看商品>进入购物结算界面！");
			break;
		case 4:
			System.out.println("系统已注销！");
			break;
		default:
			System.out.println("滚犊子，好好输入！");
			break;
		}
	}
}
