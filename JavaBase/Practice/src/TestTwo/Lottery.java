package TestTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//娱乐彩票销售系统
public class Lottery {
	//机选号码
	int [][] machineSelectionNodes = new int[5][5];
	//自选号码
	int [][] optionalSelectionNodes = new int[5][5];
	//中奖号码
	int [] awardNums = new int [5];
	//三等奖
	String[] no3 = new String[5];
	//二等奖
	String[] no2 = new String[5];
	//一等奖
	String[] no1 = new String[5];
			
	//自选号码
	public void optionalSelection() {
		System.out.println("自选:");
		System.out.println("请输入要买几注:(最多5注)");
		Scanner sc = new Scanner(System.in);
		int howNum = sc.nextInt();
		optionalSelectionNodes = new int[howNum][5];
		//遍历所有一维数组（遍历每一注彩票）
		for (int i = 0; i < optionalSelectionNodes.length; i++) {
			//遍历当前一维数组的所有元素（每一注彩票中的具体数字）
			for (int j = 0; j < optionalSelectionNodes[i].length; j++) {
				/*
				 * while(true) { //判断生成的随机数是否在当前数组中存在 if(container(machineSelectionNodes[i],
				 * value)) { value = ran.nextInt(33); }else { break; } }
				 */
				System.out.println("请输入第"+(i+1)+"注的第"+(j+1)+"个号码:");
				int value = sc.nextInt();
				optionalSelectionNodes[i][j] = value;
			}
			Arrays.sort(optionalSelectionNodes[i]);//将数组从小到大排序
		}
	}
	
	//机选号码----->5注一起买，随机生成5注彩票，生成的每一注彩票中的数字不能重复     0-32之间数字
	public void machineSelection() {
		System.out.println("机选:");
		Random ran = new Random();
		//遍历所有一维数组（遍历每一注彩票）
		for (int i = 0; i < machineSelectionNodes.length; i++) {
			//遍历当前一维数组的所有元素（每一注彩票中的具体数字）
			for (int j = 0; j < machineSelectionNodes[i].length; j++) {
				//生成随机数字
				int value = ran.nextInt(33);
				while(true) {
					//判断生成的随机数是否在当前数组中存在
					if(container(machineSelectionNodes[i], value)) {
						value = ran.nextInt(33);
					}else {
						break;
					}
				}
				//赋值  一个一个数组的赋值      [0][0]   [0][1]   [0][2]
				machineSelectionNodes[i][j] = value;
			}
			Arrays.sort(machineSelectionNodes[i]);//将数组从小到大排序
		}
	}
	//验证一个数组里面是否包含一个数值
	public boolean container(int[]array,int value) {
		boolean flag = false;//默认设置为不包含
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	//摇奖
	public void drawLottery() {
		Random ran = new Random();
		for (int i = 0; i < awardNums.length; i++) {
			int value = ran.nextInt(33);
			while(true) {
				if(container(awardNums, value)) {
					value = ran.nextInt(33);
				}else {
					break;
				}
			}
			awardNums[i] = value;
		}
		Arrays.sort(awardNums);
	}
	//开奖
	public void getLottery() {
		//开机选的奖
		for (int i = 0; i < machineSelectionNodes.length; i++) {//遍历每一注彩票
			int count = 0;//记录包含次数
			for (int j = 0; j < awardNums.length; j++) {//遍历5个中奖号码
				if(container(machineSelectionNodes[i], awardNums[j])) {
					count++;
				}else {
					continue;
				}
			}
			switch (count) {
			case 3:
				no3[i] = Arrays.toString(machineSelectionNodes[i]);
				break;
			case 4:
				no2[i] = Arrays.toString(machineSelectionNodes[i]);
				break;
			case 5:
				no1[i] = Arrays.toString(machineSelectionNodes[i]);
				break;
			default:
				break;
			}
		}
		//开机选的奖
		for (int i = 0; i < optionalSelectionNodes.length; i++) {//遍历每一注彩票
			int count = 0;//记录包含次数
			for (int j = 0; j < awardNums.length; j++) {//遍历5个中奖号码
				if(container(optionalSelectionNodes[i], awardNums[j])) {
					count++;
				}else {
					continue;
				}
			}
			switch (count) {
			case 3:
				no3[i] = Arrays.toString(optionalSelectionNodes[i]);
				break;
			case 4:
				no2[i] = Arrays.toString(optionalSelectionNodes[i]);
				break;
			case 5:
				no1[i] = Arrays.toString(optionalSelectionNodes[i]);
				break;
			default:
				break;
			}
		}
		showResult();//展示本次彩排的购买和开奖信息
	}
	//展示彩票信息
	public void showResult() {
		System.out.println("机选号码为:");
		for (int i = 0; i < machineSelectionNodes.length; i++) {
			System.out.println(Arrays.toString(machineSelectionNodes[i]));
		}
		System.out.println("自选号码为:");
		for (int i = 0; i < optionalSelectionNodes.length; i++) {
			System.out.println(Arrays.toString(optionalSelectionNodes[i]));
		}
		System.out.println("开奖号码:");
		System.out.println(Arrays.toString(awardNums));
		System.out.println("一等奖号码:");
		System.out.println(Arrays.toString(no1));
		System.out.println("二等奖号码:");
		System.out.println(Arrays.toString(no2));
		System.out.println("三等奖号码:");
		System.out.println(Arrays.toString(no3));
	}
	//运行程序
	public void start() {
		System.out.println("*******************************************");
		System.out.println("                    欢迎进入娱乐彩票系统                        ");
		System.out.println("                从0-32之间选出5个数字组成一注彩票       ");
		System.out.println("********************************************");
		String agin;
		do {
			System.out.println("请选择功能:      1.机选              2.自选           ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				machineSelection();//机选
				break;
			case 2:
				optionalSelection();//自选
				break;
			default:
				System.out.println("输入错误！");
				break;
			}
			drawLottery();//摇奖
			getLottery();//开奖
			clean();//清空中奖信息
			System.out.println("是否再买一次? y/n");
			agin = sc.next();
		}while(agin.equals("y"));
	}
	//清空中奖信息
	public void clean() {
		Arrays.fill(no1, null);
		Arrays.fill(no2, null);
		Arrays.fill(no3, null);
	}
}
