package TestOne;

import java.util.Scanner;

public class Game {
	Scanner sc=new Scanner(System.in);
	int my,pc;
	int myWin=0;
	int pcWim=0;
	int drawWim=0;
	public void player() {
		System.out.println("猜拳游戏：0---石头，1---剪刀，3---布；请在下方输入你的出拳");
		my = sc.nextInt();
		switch (my) {
		case 0:
			System.out.println("您出的是：石头");
			break;
		case 1:
			System.out.println("您出的是：剪刀");
			break;
		case 2:
			System.out.println("您出的是：布");
			break;
		default:
			System.out.println("输入有误，请重新输入！");
			player();
			break;
		}
	}
	public void compter() {
		pc=(int)(Math.random()*3);
		switch (pc) {
		case 0:
			System.out.println("计算机出的是：石头");
			break;
		case 1:
			System.out.println("计算机出的是：剪刀");
			break;
		case 2:
			System.out.println("计算机出的是：布");
			break;
		}
	}
	public void compare() {
		if (my==pc) {
			System.out.println("这次是平局哦！");
			drawWim++;
		}else if (my==0&&pc==1||my==1&&pc==2||my==2&&pc==0) {
			System.out.println("恭喜你,你赢了！");
			myWin++;
		}else {
			System.out.println("你输了！再接再厉！");
			pcWim++;
		}
	}
	public void showIf() {
		System.out.println("你一共赢了"+myWin+"次；");
		System.out.println("计算机赢了"+pcWim+"次；");
		System.out.println("平局"+drawWim+"次；");
	}
	public void start() {
		String agin;
		System.out.println("**********************************");
		System.out.println("\t   欢迎进入猜拳游戏");
		System.out.println("**********************************");
		do {
			player();
			compter();
			compare();
			System.out.println("是否继续玩？ y/n");
			agin=sc.next();
		} while (agin.equals("y"));
		showIf();
	}
}
