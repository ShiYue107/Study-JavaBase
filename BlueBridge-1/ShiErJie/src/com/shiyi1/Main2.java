package com.shiyi1;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入所购商品的金额：");
		double money=sc.nextDouble();
		System.out.println("请选择优惠换购活动：");
		System.out.println("1.消费50元，加1元可换购一瓶可口可乐\n"
				+ "2.消费100元，加2元可换购一瓶洗洁精\n3.消费200元，加5元可换购一瓶海飞丝洗发水\n"
				+ "4.消费300元，加10元可换购一箱伊利牛奶\n0.不换购");
		System.out.print("请选择活动类型：");
		int choose=sc.nextInt();
		switch (choose) {
		case 1:
			if (money>=50) {
				money+=1;
				System.out.println("本次消费总金额："+money+"\n成功换购：一瓶可口可乐");
				break;
			}else {
				System.out.println("您的消费金额没有满50元！");
				System.out.println("本次消费总金额："+money);
				break;
			}
		case 2:
			if (money>=100) {
				money+=1;
				System.out.println("本次消费总金额："+money+"\n成功换购：一瓶洗洁精");
				break;
			}else {
				System.out.println("您的消费金额没有满100元！");
				System.out.println("本次消费总金额："+money);
				break;
			}
		case 3:
			if (money>=200) {
				money+=1;
				System.out.println("本次消费总金额："+money+"\n成功换购：一瓶海飞丝洗发水");
				break;
			}else {
				System.out.println("您的消费金额没有满200元！");
				System.out.println("本次消费总金额："+money);
				break;
			}
		case 4:
			if (money>=300) {
				money+=1;
				System.out.println("本次消费总金额："+money+"\n成功换购：一箱伊利牛奶");
				break;
			}else {
				System.out.println("您的消费金额没有满300元！");
				System.out.println("本次消费总金额："+money);
				break;
			}
		case 0:
			System.out.println("本次消费总金额："+money);
			break;
		default:
			System.out.println("滚犊子");
			break;
		}
	}
}
