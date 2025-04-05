package domeTest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Account a1=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入卡号：");
		long carid=sc.nextLong();
		a1.setCarid(carid);
		System.out.println("请输入存款金额：");
		double money=sc.nextDouble();
		a1.cun(money);
		System.out.println("请输入取款金额：");
		double quMoney=sc.nextDouble();
		a1.qu(quMoney);
		a1.showBalance();
	}

}
