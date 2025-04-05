package TestTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuyLottery {
	int [][]arrayNum = new int [5][5];//机选
	int [][]optionNum=new int [5][5];//自选
	int []awardNum=new int[5];
	String[]no3=new String[5];
	String[]no2=new String[5];
	String[]no1=new String[5];
	//自选
	public void opLottery() {
		System.out.println("自选：");
		System.out.println("请输入要买几注：(最多5注)");
		Scanner sc=new Scanner(System.in);
		int howNum=sc.nextInt();
		optionNum=new int [howNum][5];
		for (int i = 0; i < optionNum.length; i++) {
			for (int j = 0; j < optionNum[i].length; j++) {
				System.out.println("请输入"+(i+1)+"注的第"+(j+1)+"个号码：");
				int num=sc.nextInt();
			}
			Arrays.sort(optionNum[i]);
		}
	}
	//机选
	public void pcLottery() {
		System.out.println("机选数：");
		Random rdm=new Random();
		for (int i = 0; i < arrayNum.length; i++) {
			for (int j = 0; j < arrayNum[i].length; j++) {
				int value=rdm.nextInt(33);
				while (true) {
					if (arrayIf(arrayNum[i], value)) {
						value=rdm.nextInt(33);
					}else {
						break;
					}
				}
				arrayNum[i][j]=value;
			}
			Arrays.sort(arrayNum[i]);
		}
	}
	//判断重复
	public boolean arrayIf(int[]array,int value) {
		boolean no=false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==value) {
				no=true;
				break;
			}
		}
		return no;
	}
	
	//中奖号码
	public void drawLotty() {
		Random rdm=new Random();
		for (int i = 0; i < arrayNum.length; i++) {
			int value=rdm.nextInt(33);
			while (true) {
				if (arrayIf(awardNum, value)) {
					value=rdm.nextInt(33);
				}else {
					break;
				}
			}
			awardNum[i]=value;
		}
		Arrays.sort(awardNum);
	}
	//开奖
	public void getLottery() {
		for (int i = 0; i < arrayNum.length; i++) {
			int sum=0;
			for (int j = 0; j < awardNum.length; j++) {
				if (arrayIf(arrayNum[i], awardNum[j])) {
					sum++;
				}else {
					continue;
				}
			}
			switch (sum) {
			case 3:
				no3[i]=Arrays.toString(arrayNum[i]);
				break;
			case 4:
				no2[i]=Arrays.toString(arrayNum[i]);
				break;
			case 5:
				no1[i]=Arrays.toString(arrayNum[i]);
				break;
	
			default:
				break;
			}
		}
		for (int i = 0; i < optionNum.length; i++) {
			int sum=0;
			for (int j = 0; j < arrayNum.length; j++) {
				if (arrayIf(optionNum[i], awardNum[j])) {
					sum++;
				}else {
					continue;
				}
			}
			switch (sum) {
			case 3:
				no3[i]=Arrays.toString(optionNum[i]);
				break;
			case 4:
				no2[i]=Arrays.toString(optionNum[i]);
				break;
			case 5:
				no1[i]=Arrays.toString(optionNum[i]);
				break;
	
			default:
				break;
			}
		}
		showRes();
	}
	
	public void showRes() {
		System.out.println("机选号码为：");
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println(Arrays.toString(arrayNum[i]));
		}
		System.out.println("自选号码为：");
		for (int i = 0; i < optionNum.length; i++) {
			System.out.println(Arrays.toString(optionNum[i]));
		}
		System.out.println("开奖号码：");
		System.out.println(Arrays.toString(awardNum));
		System.out.println("一等奖号码：");
		System.out.println(Arrays.toString(no1));
		System.out.println("二等奖号码：");
		System.out.println(Arrays.toString(no2));
		System.out.println("三等奖号码：");
		System.out.println(Arrays.toString(no3));
	}
	
	public void start() {
		System.out.println("*******************************************");
		System.out.println("                   欢迎进入娱乐彩票系统                        ");
		System.out.println("         从0-32之间选出5个数字组成一注彩票  \n\t机选必须买五注     ");
		System.out.println("*******************************************");
		String agin;
		do {
			System.out.println("请选择功能:\t1.机选\t2.自选           ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				pcLottery();//机选
				break;
			case 2:
				opLottery();//自选
				break;
			default:
				System.out.println("输入错误！请重新输入！");
				start();
				break;
			}
			drawLotty();
			getLottery();
			clean();
			System.out.println("是否再买一次? y/n");
			agin = sc.next();
		}while(agin.equals("y"));
	}
	//清除
	public void clean() {
		Arrays.fill(no1, null);
		Arrays.fill(no2, null);
		Arrays.fill(no3, null);
	}
}






















